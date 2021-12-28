package com.bigspin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Jeff Ma
 * @Date: 2021/12/28 16:29
 */
public class MyApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Hello hello = (Hello)ac.getBean("hello");
		hello.sayHello();
	}

}
