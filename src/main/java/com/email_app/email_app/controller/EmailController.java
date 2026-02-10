package com.email_app.email_app.controller;

import org.springframework.web.bind.annotation.RestController;
import com.email_app.email_app.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody EmailDetails details) {
        String status = emailService.sendSimpleMail(details);
        return status;

    @postMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody EmailDetails details) {
        String status = emailService.sendMailWithAttachment(details);
        return status;      
}
