package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Activity;

public class UserTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/SpringFramework.xml");
		Activity activity = context.getBean("activity", Activity.class);
		System.out.println(activity);
	}
}
