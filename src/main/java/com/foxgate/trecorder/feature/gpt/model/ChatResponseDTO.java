package com.foxgate.trecorder.feature.gpt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChatResponseDTO
{
    private List<Choice> choices;

    @ToString
    public static class Choice {

        private int index;
        private Message message;
    }
}
