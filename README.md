# Spring-Boot-Study
Spring-Boot-Study

Spring Boot의 기본 원리
## 1. @SprngBootApplication 안의 숨겨진 원리
@EnableAutoConfiguration (@SpringBootApplication 안에 숨어 있음) <br/>
&nbsp; &nbsp;● 빈은 사실 두 단계로 나눠서 읽힘 <br/>
&nbsp; &nbsp;&nbsp; &nbsp;○ 1단계: @ComponentScan <br/>
&nbsp; &nbsp;&nbsp; &nbsp;○ 2단계: @EnableAutoConfiguration <br/>
&nbsp; &nbsp;● @ComponentScan <br/>
&nbsp; &nbsp;&nbsp; &nbsp;○ @Component <br/>
&nbsp; &nbsp;&nbsp; &nbsp;○ @Configuration @Repository @Service @Controller @RestController <br/>
&nbsp; &nbsp;● @EnableAutoConfiguration <br/>
&nbsp; &nbsp;&nbsp; &nbsp;○ spring.factories <br/>
&nbsp; &nbsp;● org.springframework.boot.autoconfigure.EnableAutoConfiguration <br/>
&nbsp; &nbsp;&nbsp; &nbsp;○ @Configuration <br/>
&nbsp; &nbsp;&nbsp; &nbsp;○ @ConditionalOnXxxYyyZzz <br/>
