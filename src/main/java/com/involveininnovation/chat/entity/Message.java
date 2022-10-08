package com.involveininnovation.chat.entity;

import com.involveininnovation.chat.model.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private UUID sender;
    private UUID receiver;
    private String message;
    private Long date;
    private String status;

    public Message(UUID sender, UUID receiver, String message, Long date, String status) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.date = date;
        this.status = status;
    }

    public Message() {
    }
}
