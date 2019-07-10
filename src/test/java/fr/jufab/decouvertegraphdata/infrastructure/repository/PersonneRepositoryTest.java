package fr.jufab.decouvertegraphdata.infrastructure.repository;

import fr.jufab.decouvertegraphdata.infrastructure.entity.Adresse;
import fr.jufab.decouvertegraphdata.infrastructure.entity.Personne;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PersonneRepositoryTest {

    @Autowired
    PersonneRepository personneRepository;

    @Test
    public void saveTest() {
        Personne personne = new Personne("FABRE", "Julien");
        personne = personneRepository.save(personne);
        System.out.println("Id de la personne : "+ personne.getId());
        assertNotNull(personne.getId());
    }

    @Test
    public void saveAgainTest() {
        Personne personne = new Personne("FABRE", "Julien");
        personne = personneRepository.save(personne);
        System.out.println("Id de la personne : "+ personne.getId());
        assertNotNull(personne.getId());
    }

    @Test
    public void zAddAdresseToPersonne() {
        Personne personne = personneRepository.findById(new Long(0)).get();
        Adresse adresse = new Adresse();
        adresse.setNomDeLaRue("route de toulouse");
        adresse.setNumero(1);
        adresse.setCodePostal("33140");
        adresse.setVille("Villenave d'ornon");
        personne.setAdresse(adresse);
        personne = personneRepository.save(personne);
        assertNotNull(personne.getAdresse());
        System.out.println(personne.getAdresse());
        assertEquals("route de toulouse",personne.getAdresse().getNomDeLaRue());
    }


}