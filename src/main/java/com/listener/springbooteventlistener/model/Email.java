package com.listener.springbooteventlistener.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.File;
import java.util.List;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class Email {

      String from;
      String toEmail;
      String subject;
      String message;
      List<File> attachments;

}
