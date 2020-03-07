package com.speedmaisingle;

public interface EmailSmtpHandle {

    String sendSmtpEmailResult(EmailUserInfo emailUserInfo, EmailInfo emailInfo, EmailSmtpCredentials emailSmtpCredentials);
}
