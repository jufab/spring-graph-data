package fr.jufab.decouvertegraphdata.infrastructure.repository;

import fr.jufab.decouvertegraphdata.infrastructure.entity.Personne;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PersonneRepositoryTest {

    @Autowired
    PersonneRepository personneRepository;

    @Test
    public void saveTest() {
        Personne personne = new Personne("FABRE", "Julien");
        personne = personneRepository.save(personne);
        System.out.println(personne.getId());
        assertNotNull(personne.getId());
    }

    @Test
    public void saveAgainTest() {
        Personne personne = new Personne("FABRE", "Julien");
        personne = personneRepository.save(personne);
        System.out.println(personne.getId());
        assertNotNull(personne.getId());
    }


}