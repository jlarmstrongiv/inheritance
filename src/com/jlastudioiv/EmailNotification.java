package com.jlastudioiv;

public class EmailNotification extends Notification{
    private String recipient;
    private String smtpProvider;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //@Override // this code block’s instructions are a bit weird
    protected Object clone(EmailNotification emailNotification) throws CloneNotSupportedException {
        try {
            Object EmailNotificationClone = emailNotification.clone();
            return EmailNotificationClone;
        } catch (CloneNotSupportedException ex) {
            Object object = null;
            return object;
        }
    }

    @Override
    public void transport() throws Exception {
        super.transport();
    }
    @Override
    public void protectedMethod() {
        super.protectedMethod();
        System.out.println("some more text");
    }

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    public void setSmtpProvider(String smtpProvider) {
        this.smtpProvider = smtpProvider;
    }
}
