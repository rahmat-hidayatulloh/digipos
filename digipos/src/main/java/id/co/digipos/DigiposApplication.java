package id.co.digipos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"id.co.digipos.model.entity"})
public class DigiposApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigiposApplication.class, args);
	}

}