package com.example.springbootgettingstarted.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @Autowired
    private SampleService sampleService;
    private Logger logger = LoggerFactory.getLogger(SampleController.class);

//    @GetMapping("/hello")
//    public String hello(){
//        logger.info("test");
//        return "hello "+sampleService.getName();
//    }

}
