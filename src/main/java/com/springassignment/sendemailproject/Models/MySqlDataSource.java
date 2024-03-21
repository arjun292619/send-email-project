package com.springassignment.sendemailproject.Models;

import org.springframework.stereotype.Component;

//@Component
public class MySqlDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        return emails;
    }
}
