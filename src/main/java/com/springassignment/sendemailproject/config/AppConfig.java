package com.springassignment.sendemailproject.config;

import com.springassignment.sendemailproject.Models.DataSource;
import com.springassignment.sendemailproject.Models.MySqlDataSource;
import com.springassignment.sendemailproject.Models.PostgreSqlDataSource;
import com.springassignment.sendemailproject.Service.EmailService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DataSource mySqlDataSource() {
        return new MySqlDataSource();
    }

    @Bean
    public DataSource postGreSqlDataSource() {
        return new PostgreSqlDataSource();
    }

    @Bean
    public EmailService emailService(@Qualifier("postGreSqlDataSource") DataSource dataSource) {
        return new EmailService(dataSource);
    }
}
