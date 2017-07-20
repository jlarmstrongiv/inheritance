package com.jlastudioiv;

public class Main {

    public static void main(String[] args) throws Exception {
        EmailNotification emailNotification = new EmailNotification("mySubject", "myBody", "myRecipient", "mySmtpProvider");
        TextNotification textNotification = new TextNotification("mySubject", "myBody", "myRecipient", "mySmsProvider");

        textNotification.setStatus("unread");
        textNotification.protectedMethod();
        textNotification.transport();

        System.out.println("");

        emailNotification.protectedMethod();

    }
}
