package mx.tec.web.lab;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Lab 3 Main Class 
 * @author Enrique Sanchez
 */
@SpringBootApplication
public class Lab3DraftApplication {
	/**
	 * Main method.
	 * @param args The command line arguments.
	 **/
	public static void main(String[] args) {
		SpringApplication.run(Lab3DraftApplication.class, args);
	}

	/**
	 * Create a Model Mapper for the Application
	 * @return A model Mapper for conversion between objects
	 */
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
}
