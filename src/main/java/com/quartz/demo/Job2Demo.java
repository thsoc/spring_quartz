package com.quartz.demo;
 
import java.util.Date;
 
public class Job2Demo {
	public void sayHello() {
		System.out.println(new Date() + " -> Hello, 我是任务 1");
	}
}