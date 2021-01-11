import java.awt.Color;
import junit.framework.*;

public class TestMapAttack {

	public void testMapAttack() {
		
        NoFrame frame = new NoFrame();
		
		frame.addPacMan(new Location(4, 4));
		frame.addGhost(new Location(4, 5), "test", Color.white);
		
		assertTrue(frame.getMap().attack("test"));

		assertTrue(frame.getMap().isGameOver());

	}


    public void testMapAttack3(){
        NoFrame frame = new NoFrame();

		frame.addPacMan(new Location(9, 9));
		frame.addGhost(new Location(10, 12), "Boo", Color.white);

		// Make sure that Boo can't attack pacman
		assertFalse(frame.getMap().attack("Boo"));

		// Make sure that the game is not over
		assertFalse(frame.getMap().isGameOver());
    }

}
