package com.usetech.client.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;

import java.util.Arrays;

/**
 * Created by User on 18.11.2016.
 */
@Configuration
public class JmsCongfig {

    @Autowired
    private CommonConfig config;

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new MappingJackson2MessageConverter();
    }

    @Bean
    public ActiveMQConnectionFactory connectionFactory() {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL(config.getBrokerUrl());
        connectionFactory.setTrustedPackages(Arrays.asList("com.usetech.client"));
        return connectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate() {
        JmsTemplate template = new JmsTemplate();
        template.setConnectionFactory(connectionFactory());
        template.setDefaultDestinationName(config.getTopicName());
        template.setMessageConverter(jsonMessageConverter());
        template.setPubSubDomain(true);
        return template;
    }
}
