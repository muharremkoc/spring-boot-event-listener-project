package com.listener.springbooteventlistener.service;

import com.listener.springbooteventlistener.event.EmailEvent;
import com.listener.springbooteventlistener.model.Email;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;


@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public  class EmailServiceImpl implements ApplicationEventPublisherAware,EmailService {

     ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }
    @Override
    public String sendEmail(Email email) {
        this.applicationEventPublisher.publishEvent(new EmailEvent(this,email));
        return "Event is publishing";
    }


}
