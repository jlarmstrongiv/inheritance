package com.jlastudioiv;

import java.time.LocalDateTime;

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    protected void protectedMethod() {
        System.out.println("some text");
    }

    public void showStatus() {
        System.out.println(status);
    }

    public Notification() {
    }

    public Notification(String subject, String body) {
        createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;
    }

    public void transport() throws Exception{
        throw new NoTransportException();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
}
