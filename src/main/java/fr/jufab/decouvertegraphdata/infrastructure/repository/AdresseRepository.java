package fr.jufab.decouvertegraphdata.infrastructure.repository;

import fr.jufab.decouvertegraphdata.infrastructure.entity.Adresse;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AdresseRepository extends Neo4jRepository<Adresse, Long> {
}
