package com.example.chatApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        message.setTimestamp(LocalDateTime.now().toString());
        return message;
    }

    @MessageMapping("/typing")
    @SendTo("/topic/typing")
    public TypingStatus typing(TypingStatus status) {
        return status;
    }
    
}
