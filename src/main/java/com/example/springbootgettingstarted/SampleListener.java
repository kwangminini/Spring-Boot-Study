package com.example.springbootgettingstarted;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationRunner { //application이 실행되고 난 뒤

    @Autowired
    KeesunProperties keesunProperties;
    @Autowired
    private String hello;
    private Logger logger = LoggerFactory.getLogger(SampleListener.class);
    @Override
    public void run(ApplicationArguments args) throws Exception {
//        logger.info("==============");
//        logger.info(hello);
//        logger.info(keesunProperties.getName());
//        logger.info(""+keesunProperties.getAge());
//        logger.info("==============");
    }
}
