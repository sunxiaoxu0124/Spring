package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.Activity;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/resource/SpringFramework.xml");
		Activity activity = context.getBean("activity", Activity.class);
		System.out.println(activity);
	}
}
