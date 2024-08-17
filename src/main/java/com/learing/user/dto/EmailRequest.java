package com.learing.user.dto;


public class EmailRequest {
    private String to;
    private String cc;
    private String subject;
    private String text;

    public EmailRequest() {
    }

    public EmailRequest(String to, String cc, String subject, String text) {
        this.to = to;
        this.cc = cc;
        this.subject = subject;
        this.text = text;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
