package com.example.springbootgettingstarted;

import com.example.springbootgettingstarted.account.Account;
import com.example.springbootgettingstarted.account.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.Optional;

@Component
public class SampleListener implements ApplicationRunner { //application이 실행되고 난 뒤

    @Autowired
    KeesunProperties keesunProperties;
    @Autowired
    StringRedisTemplate redisTemplate;
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    private String hello;
    private Logger logger = LoggerFactory.getLogger(SampleListener.class);
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setEmail("test2@gmail.com");
        account.setUsername("aaa2");
        accountRepository.insert(account);
        System.out.println("finished");

//        ValueOperations<String,String>  values = redisTemplate.opsForValue();
//        values.set("keesun","whiteship");
//        values.set("springboot","2.0");
//        values.set("hello","world");
//
//        Account account = new Account();
//        account.setEmail("kwangmin@email.com");
//        account.setUsername("keesun");
//        accountRepository.save(account);
//
//        Optional<Account> byId = accountRepository.findById(account.getId());
//        System.out.println(account);
//        System.out.println(account.getId());
//        System.out.println(byId.get().getId());
//        System.out.println(byId.get().getUsername());
//        System.out.println(byId.get().getEmail());

    }
}
