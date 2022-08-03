package com.involveininnovation.chat.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MessageCommand {
    private String senderName;
    private String receiverName;
    private String message;
    private Long date;
    private Status status;
}
