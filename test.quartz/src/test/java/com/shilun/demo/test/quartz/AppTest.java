package com.shilun.demo.test.quartz;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void sbTest() throws IOException{
		ApplicationContext context =new ClassPathXmlApplicationContext("config/applicationContext.xml");
		System.in.read();
	}
}
