package com.estudo.springproducer.dto;

public class EmailModelDto {

    private String owerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    private String text;

    public String getOwerRef() {
        return owerRef;
    }

    public void setOwerRef(String owerRef) {
        this.owerRef = owerRef;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
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
