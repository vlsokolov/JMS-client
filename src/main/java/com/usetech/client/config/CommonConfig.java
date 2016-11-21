package com.usetech.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by User on 18.11.2016.
 */
@Configuration
@PropertySource("classpath:application.properties")
public class CommonConfig {

    @Value("${com.usetech.client.topicName}")
    private String topicName;

    @Value("${com.usetech.client.brokerUrl}")
    private String brokerUrl;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public String getTopicName() {
        return topicName;
    }

    public String getBrokerUrl() {
        return brokerUrl;
    }
}
