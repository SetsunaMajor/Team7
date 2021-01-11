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
}
