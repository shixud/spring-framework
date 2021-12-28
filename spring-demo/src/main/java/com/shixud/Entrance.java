package com.shixud;

import com.shixud.service.HelloService;
import com.shixud.service.HiService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.shixud")
public class Entrance {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		HiService hiService = (HiService)applicationContext.getBean("hiServiceImpl");
		hiService.sayHi();
		System.out.println("---------------------------HelloService-------------------------------");
		HelloService helloService = (HelloService)applicationContext.getBean("helloServiceImpl");
		helloService.sayHello();
	}
}
