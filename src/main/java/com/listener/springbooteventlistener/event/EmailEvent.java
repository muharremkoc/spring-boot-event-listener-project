package com.listener.springbooteventlistener.event;

import com.listener.springbooteventlistener.model.Email;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.context.ApplicationEvent;


@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmailEvent extends ApplicationEvent {

    static final long serialVersionUID=1L;
    Email email;

    public EmailEvent(Object source,Email email) {
        super(source);
        this.email=email;
    }
}
