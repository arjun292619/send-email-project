package com.springassignment.sendemailproject.Service;

import com.springassignment.sendemailproject.Models.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class EmailService {
    private DataSource dataSource;

//    @Autowired
    public EmailService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void sendEmail() {
        printEmailList(dataSource.getEmails());
    }

    private void printEmailList(String[] emails) {
        for (String email : emails) {
            System.out.println(email + " sent out");
        }
    }

}
