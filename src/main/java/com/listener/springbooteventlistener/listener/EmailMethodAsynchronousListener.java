package com.listener.springbooteventlistener.listener;

import com.listener.springbooteventlistener.event.EmailEvent;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class EmailMethodAsynchronousListener {

    static   final Logger logger= LoggerFactory.getLogger(EmailMethodAsynchronousListener.class);

    @Async
    @EventListener
    @Order(3)
    public void  handleEvent(EmailEvent emailEvent){
        logger.info(
                " Email sent through Asynchronous Event."+"source:"+emailEvent.getSource()+" email:"+emailEvent.getEmail());
    }

}

