package com.cursova.oksana.kn.mail;

public interface EmailService {
    void sendSimpleMessage(String to, String subject, String text);
}
