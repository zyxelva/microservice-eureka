package com.taeyeon.zyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaRegistryDemo
{
	public static void main( String[] args )
	{
		SpringApplication.run(EurekaRegistryDemo.class, args);
	}
}
