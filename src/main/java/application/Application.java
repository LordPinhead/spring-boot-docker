package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import application.services.RestfullServices;

@SpringBootApplication
public class Application {

	@Autowired
	RestfullServices service = null;
	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ApplicationConfig.class);
		context.refresh();
		((ConfigurableApplicationContext) context).close();

		SpringApplication.run(Application.class, args);
	}
}
