package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // servlet auto register
@SpringBootApplication
public class LaylaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaylaApplication.class, args);
	}

}