package spring;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.Yaml;
@SpringBootApplication
@RestController
public class springC {
	
		
	@Value("${basic.value}")
	private String value;
	
	@Value("${basic.message}")
	private String message;
	
	@Value("${basic.number}")
	private String number;
	
	public static void main(String[] args) {
		SpringApplication.run(springC.class, args);
		System.out.println("Hey");
	}
	}

	    