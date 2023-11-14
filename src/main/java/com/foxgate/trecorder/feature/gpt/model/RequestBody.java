package com.foxgate.trecorder.feature.gpt.model;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class RequestBody
{
    private String model;
    private List<Message> messages;
    private int n;
    private double temperature;

    public RequestBody(String model, String prompt) {
        this.model = model;

        this.messages = new ArrayList<>();
        this.messages.add(new Message("user", prompt));
    }
}
