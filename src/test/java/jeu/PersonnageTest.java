package jeu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {

   @Test
    void tournerQuatreFois() {
        Personnage p = new Personnage();
        assertEquals(Personnage.Orientation.NORD, p.tourner(4));
    }
}
