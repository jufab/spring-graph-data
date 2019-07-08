package fr.jufab.decouvertegraphdata.infrastructure.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@Data
/*@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)*/
@AllArgsConstructor @NoArgsConstructor
@NodeEntity
public class Adresse {

    @Id @GeneratedValue private Long id;
    private String nom;
    private int numero;
    private String codePostal;
    private String ville;
    private @Relationship(type = "EST_HABITE_PAR", direction = Relationship.INCOMING) Personne personne;
}
