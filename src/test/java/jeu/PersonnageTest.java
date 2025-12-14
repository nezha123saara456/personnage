package jeu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {

  @Test
    void tournerUneFois() {
        Personnage p = new Personnage();
        assertEquals(Personnage.Orientation.EST, p.tourner(1));
    }

   @Test
    void tournerDeuxFois() {
        Personnage p = new Personnage();
        assertEquals(Personnage.Orientation.SUD, p.tourner(2));
    }
   @Test
    void tournerQuatreFois() {
        Personnage p = new Personnage();
        assertEquals(Personnage.Orientation.NORD, p.tourner(4));
    }
}
