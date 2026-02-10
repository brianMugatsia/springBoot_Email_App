package com.email_app.email_app.service;

import com.email_app.email_app.Entity.EmailDetails;

public interface EmailService {
    // method to send a simple email
    String sendSimpleMail(EmailDetails details);

    //
    String sendMailWithAttachment(EmailDetails details);
}
