package com.listener.springbooteventlistener.listener;

import com.listener.springbooteventlistener.event.EmailEvent;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class EmailMethodListener {
    static   final Logger logger= LoggerFactory.getLogger(EmailMethodListener.class);

    @EventListener
    @Order(2)
    public void handleEvent(EmailEvent event) {
        // Prepare email and send email using email API.
        logger.info(" Email sent Method Listener Event."+"source:"+event.getSource()+" email:"+event.getEmail());
    }
}
