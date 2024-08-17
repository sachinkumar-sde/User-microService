package com.learing.user.service;

import com.learing.user.dto.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(EmailRequest emailRequest) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(emailRequest.getTo());
        message.setBcc(emailRequest.getCc());
        message.setSubject(emailRequest.getSubject());
        message.setText(emailRequest.getText());
        mailSender.send(message);
    }
}
