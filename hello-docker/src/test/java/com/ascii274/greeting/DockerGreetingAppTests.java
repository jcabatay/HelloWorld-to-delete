package com.ascii274.greeting;

import com.ascii274.greeting.controller.GreetingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DockerGreetingAppTests {
	@Autowired
	GreetingController greetingController;

	@Test
	void contextLoads() {
	}

	@Test
	private void greetTest() throws Exception{
		assertThat(greetingController).isNotNull();
	}
}
