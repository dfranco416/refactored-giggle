package com.example.cicdproj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CicdprojApplicationTests {

	@Autowired
	private MathController controller;

	@Test
	void contextLoads() throws Exception{
		assertThat(controller).isNotNull();
	}

}
