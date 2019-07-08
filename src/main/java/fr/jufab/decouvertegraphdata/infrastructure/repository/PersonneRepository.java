package fr.jufab.decouvertegraphdata.infrastructure.repository;

import fr.jufab.decouvertegraphdata.infrastructure.entity.Personne;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonneRepository extends Neo4jRepository<Personne,Long> {
}
