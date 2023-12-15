package com.example.entity;

import lombok.*;

@Data
public class Message {
    private String senderName;
    private String receiver;
    private String message;
    private String date;
    private Status status;
}
