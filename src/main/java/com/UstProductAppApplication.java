package com;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.cloud.client.discovery.EnableDiscoveryClient;*/
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableDiscoveryClient
//@RestController
public class UstProductAppApplication {

	public static void main(String[] args) {
		
	      ApplicationContext ctx = SpringApplication.run(UstProductAppApplication.class, args);
	      
			/*
			 * String[] beanNames = ctx.getBeanDefinitionNames();
			 * 
			 * Arrays.sort(beanNames);
			 * 
			 * for (String beanName : beanNames) { System.out.println(beanName); }
			 */
	}	
	/*
	 * @RequestMapping("/welcome") public String welcome() { return "Wecome UST"; }
	 */
}
