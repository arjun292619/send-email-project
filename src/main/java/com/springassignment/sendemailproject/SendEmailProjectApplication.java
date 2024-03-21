package com.springassignment.sendemailproject;

import com.springassignment.sendemailproject.Service.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SendEmailProjectApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SendEmailProjectApplication.class, args);
        System.out.println("-".repeat(92));
//        System.out.println(context.getBean(EmailService.class));
        EmailService emailService = context.getBean(EmailService.class);
        emailService.sendEmail();
    }

}
