package fr.jufab.decouvertegraphdata.infrastructure.entity;


import lombok.*;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
//@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@Data
public class Personne {
    @Id @GeneratedValue private Long id;
    private String nom;
    private String prenom;
    private @Relationship(type="HABITE", direction = Relationship.OUTGOING) Adresse adresse;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void habite(Adresse adresse) {
        this.adresse = adresse;
    }

}
