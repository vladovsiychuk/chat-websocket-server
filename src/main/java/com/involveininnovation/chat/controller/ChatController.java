package com.involveininnovation.chat.controller;

import com.involveininnovation.chat.entity.Message;
import com.involveininnovation.chat.model.MessageCommand;
import com.involveininnovation.chat.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @Autowired
    private MessageRepository messageRepository;

    @MessageMapping("/message")
    @SendTo("/chatroom/public")
    public MessageCommand receiveMessage(@Payload MessageCommand messageCommand) {
        return messageCommand;
    }

    @MessageMapping("/private-message")
    public MessageCommand recMessage(@Payload MessageCommand messageCommand) {
        simpMessagingTemplate.convertAndSendToUser(messageCommand.getReceiverName(), "/private", messageCommand);

        messageRepository.save(new Message(messageCommand.getSenderName(), messageCommand.getReceiverName(), messageCommand.getMessage(), messageCommand.getDate(),
                                           messageCommand.getStatus()
                                                         .toString()));
        System.out.println(messageCommand.toString());
        return messageCommand;
    }
}
