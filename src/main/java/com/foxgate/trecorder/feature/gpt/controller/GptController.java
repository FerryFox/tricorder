package com.foxgate.trecorder.feature.gpt.controller;

import com.foxgate.trecorder.feature.gpt.model.ChatResponseDTO;
import com.foxgate.trecorder.feature.gpt.model.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/gpt")
@RequiredArgsConstructor
public class GptController
{
    @Qualifier("openaiRestTemplate")
    private final RestTemplate restTemplate;

    @Value("${application.security.gpt.model}")
    private String model;

    @Value("${application.security.gpt.url}")
    private String apiUrl;


    @GetMapping("/test")
    public ResponseEntity<Void> test()
    {
        String prompt = "what is 3 + 2?";

        RequestBody request = new RequestBody(model, prompt);

        ChatResponseDTO response = restTemplate.postForObject(apiUrl, request, ChatResponseDTO.class);

        if (response == null || response.getChoices() == null || response.getChoices().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        System.out.println(response);

        return ResponseEntity.ok().build();
    }
}
