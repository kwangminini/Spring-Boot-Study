package com.example.springbootgettingstarted;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationRunner { //application이 실행되고 난 뒤 
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("args:::"+args);
    }
}
