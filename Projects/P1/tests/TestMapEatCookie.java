import java.awt.Color;
import junit.framework.*;
import java.io.*;
import static org.junit.Assert.*;


public class TestMapEatCookie extends TestCase {
	
	public void testMapEatCookie() throws FileNotFoundException {

        NoFrame frame = new NoFrame();

		PacMan player1 = frame.addPacMan(new Location(0,0));
		assertTrue(frame.getMap().eatCookie("pacman") == null);

		PacMan player2 = frame.addPacMan(new Location(1,1));
		assertTrue(frame.getMap().eatCookie("pacman") != null);
    }
}
