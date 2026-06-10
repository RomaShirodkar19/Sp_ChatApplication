package com.chat.app.controller;


import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping
    @SendTo
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

}
