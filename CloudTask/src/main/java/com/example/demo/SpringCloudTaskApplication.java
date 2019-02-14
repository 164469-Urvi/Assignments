package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskApplication.class, args);
	}
	
@Bean
public TaskProcessor taskprocessor()
{
	return new TaskProcessor();
}

public class TaskProcessor implements CommandLineRunner
{

	@Override
	public void run(String... args) throws Exception {
		if(null!=args)
		{
			System.out.println("parameters"+args.length);
			String stationId=args[1];
			String licensePlate=args[2];
			String timePlate=args[3];
			System.out.println("stationId "+stationId+ ", plate is"+licensePlate+" ,timeplate is"+timePlate+" ");
		}
		
	}
	
}
}