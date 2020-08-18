package com.example.springbootgettingstarted;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootGettingStartedApplicationTests {

	@Autowired
	Environment environment;
	@Test
	void contextLoads() {
		assertThat(environment.getProperty("keesun.name")).isEqualTo("whiteship");
	}

}
