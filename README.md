# Spring-Boot-Study
Spring-Boot-Study

Spring Boot의 기본 원리
## 1. @SprngBootApplication 안의 숨겨진 원리
@EnableAutoConfiguration (@SpringBootApplication 안에 숨어 있음) <br/>
  ● 빈은 사실 두 단계로 나눠서 읽힘 <br/>
    ○ 1단계: @ComponentScan <br/>
    ○ 2단계: @EnableAutoConfiguration <br/>
  ● @ComponentScan <br/>
    ○ @Component <br/>
    ○ @Configuration @Repository @Service @Controller @RestController <br/>
  ● @EnableAutoConfiguration <br/>
    ○ spring.factories <br/>
  ● org.springframework.boot.autoconfigure.EnableAutoConfiguration <br/>
    ○ @Configuration <br/>
    ○ @ConditionalOnXxxYyyZzz <br/>
