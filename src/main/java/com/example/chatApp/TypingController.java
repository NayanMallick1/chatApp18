package com.example.chatApp;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class TypingController {

    @MessageMapping("/typing")  // where the front-end sends typing events
    @SendTo("/topic/typing")    // where front-end subscribes to receive updates
    public TypingStatus sendTyping(TypingStatus status) {
        return status; // broadcasts the typing status to all subscribers
    }
}
