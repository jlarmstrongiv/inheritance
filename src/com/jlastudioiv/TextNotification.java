package com.jlastudioiv;

public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    @Override
    public void transport() throws Exception{
        super.transport();
    }

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    public void setSmsProvider(String smsProvider) {
        this.smsProvider = smsProvider;
    }
}
