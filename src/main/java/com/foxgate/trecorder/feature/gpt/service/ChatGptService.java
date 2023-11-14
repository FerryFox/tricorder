package com.foxgate.trecorder.feature.gpt.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ChatGptService
{
    @Value("${application.security.gpt.model}")
    private String model;

    @Value("${application.security.gpt.url}")
    private String apiUrl;

}
