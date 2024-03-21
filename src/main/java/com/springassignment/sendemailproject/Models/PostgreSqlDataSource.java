package com.springassignment.sendemailproject.Models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSqlDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        return emails;
    }
}
