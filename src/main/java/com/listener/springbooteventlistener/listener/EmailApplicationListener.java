package com.listener.springbooteventlistener.listener;

import com.listener.springbooteventlistener.event.EmailEvent;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Order(1)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmailApplicationListener implements ApplicationListener<EmailEvent> {

  static   final Logger logger= LoggerFactory.getLogger(EmailApplicationListener.class);

    @Override
    public void onApplicationEvent(EmailEvent event) {
           logger.info(" Email sent Application Listener Event."+"source:"+event.getSource()+" email:"+event.getEmail());
    }
}
