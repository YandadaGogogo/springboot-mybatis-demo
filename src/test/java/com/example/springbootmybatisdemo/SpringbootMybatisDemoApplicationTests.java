package com.example.springbootmybatisdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringbootMybatisDemoApplicationTests.class)
public class SpringbootMybatisDemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("123");
	}

}
