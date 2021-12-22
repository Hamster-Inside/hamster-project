package pl.hamsterinside.hamsterproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class HamsterProjectApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(HamsterProjectApplication.class, args);
	}


}
