package com.listener.springbooteventlistener.controller;

import com.listener.springbooteventlistener.model.Email;
import com.listener.springbooteventlistener.service.EmailService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/api/events")
public class EmailController {

    final EmailService emailService;

    @PostMapping("/sendEmail")
    public String sendEmail(){
        Email email= Email.builder()
                .from("")
                .toEmail("")
                .subject("Test")
                .message("Test")
                .build();
           return emailService.sendEmail(email);
    }
}
