package com.involveininnovation.chat.entity;

import com.involveininnovation.chat.model.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String senderName;
    private String receiverName;
    private String message;
    private Long date;
    private String status;

    public Message(String senderName, String receiverName, String message, Long date, String status) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.message = message;
        this.date = date;
        this.status = status;
    }

    public Message() {
    }
}
