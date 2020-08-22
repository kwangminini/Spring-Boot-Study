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

## 2. 스프링 웹 MVC : 정적 리소스 지원
정적 리소스 맵핑 "/**" <br/>
&nbsp;&nbsp;● 기본 리소스 위치 <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;○ classpath:/static <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;○ classpath:/public <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;○ classpath:/resources <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;○ classpath:/META-INF/resources <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;○ 예) "/hello.html" => /static/hello.html <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;○ spring.mvc.static-path-pattern: 맵핑 설정 변경 가능 <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;○ spring.mvc.static-locations: 리소스 찾을 위치 변경 가능 <br/>
&nbsp;&nbsp;● Last-Modified 헤더를 보고 304 응답을 보냄<br/>
&nbsp;&nbsp;● ResourceHttpRequestHandler가 처리함<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;○ WebMvcConfigurer의 addResourceHandlers로 커스터마이징 가능<br/>

## 3. 스프링 웹 MVC : Thymeleaf
스프링 부트가 자동설정을 지원하는 템플릿 엔진 <br/>
&nbsp;&nbsp;● FreeMarker <br/>
&nbsp;&nbsp;● Groovy <br/>
&nbsp;&nbsp;● Thymeleaf<br/>
&nbsp;&nbsp;● Mustache<br/>
<br/>
JSP를 권장하지 않는 이유 <br/>
&nbsp;&nbsp;● JAR패키징 할 때는 동작하지 않고, WAR 패키징 해야 함<br/>
&nbsp;&nbsp;● Undertow는 JSP를 지원하지 않음<br/>







