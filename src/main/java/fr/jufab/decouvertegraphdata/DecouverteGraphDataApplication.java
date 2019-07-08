package fr.jufab.decouvertegraphdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("fr.jufab.decouvertegraphdata.infrastructure.repository")
public class DecouverteGraphDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecouverteGraphDataApplication.class, args);
	}

}
