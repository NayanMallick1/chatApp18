package com.example.chatApp;

public class TypingStatus {
    private String sender;
    private boolean typing;

    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }

    public boolean isTyping() { return typing; }
    public void setTyping(boolean typing) { this.typing = typing; }
}
