package br.jus.trf1.aletheia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.jus.trf1.aletheia.config.property.AletheiaProperty;

@SpringBootApplication
@EnableConfigurationProperties(AletheiaProperty.class)
public class AletheiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AletheiaApplication.class, args);
	}
}
