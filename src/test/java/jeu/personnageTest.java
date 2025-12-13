package game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void testTurn1() {
        Character c = new Character();
        assertEquals(Character.Orientation.EAST, c.turn(1));
    }

    @Test
  /*  void testTurn2() {
        Character c = new Character();
        assertEquals(Character.Orientation.SOUTH, c.turn(2));
    }

    @Test
    void testTurn3() {
        Character c = new Character();
        assertEquals(Character.Orientation.WEST, c.turn(3));
    }

    @Test
    void testTurn4() {
        Character c = new Character();
        assertEquals(Character.Orientation.NORTH, c.turn(4));
    }

    @Test
    void testTurn5() {
        Character c = new Character();
        assertEquals(Character.Orientation.EAST, c.turn(5));
    } */
}
