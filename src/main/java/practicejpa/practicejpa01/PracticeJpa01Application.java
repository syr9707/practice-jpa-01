package practicejpa.practicejpa01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PracticeJpa01Application {

	public static void main(String[] args) {
		SpringApplication.run(PracticeJpa01Application.class, args);
	}

}
