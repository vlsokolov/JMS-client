package com.usetech.client.service;

import com.usetech.client.bean.FrameBean;
import com.usetech.client.config.CommonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Service;

import javax.jms.Message;

/**
 * Created by User on 18.11.2016.
 */
@Service
public class ConsumeMessageServiceImpl implements ConsumeMessageService {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private CommonConfig commonConfig;

    @Autowired
    private MessageConverter converter;

    FrameBean bean = new FrameBean();

    @Override
    @JmsListener(destination="ClientRequest.Topic")
    public boolean receive() {
        try {
           //   bean = (FrameBean) jmsTemplate.receiveAndConvert();
           //   System.out.println(bean);
            Message message = jmsTemplate.receive();
            System.out.println(message);
        } catch (JmsException e) {
             return false;
        }
        return true;
    }
}
