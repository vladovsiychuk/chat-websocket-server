package com.involveininnovation.chat.model;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MessageCommand {
    private String sender;
    private String receiver;
    private String message;
    private Long date;
    private Status status;
}
