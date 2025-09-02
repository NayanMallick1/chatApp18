package com.example.chatApp;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    // Handles sending messages
    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public Map<String, Object> sendMessage(ChatMessage message) {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("sender", message.getSender());
        response.put("content", message.getContent());
        response.put("timestamp", LocalDateTime.now().toString());
        return response; // Spring will automatically convert this Map to JSON
    }

    // Handles typing status
    @MessageMapping("/typing")
    @SendTo("/topic/typing")
    public TypingStatus typing(TypingStatus status) {
        return status;
    }
}
