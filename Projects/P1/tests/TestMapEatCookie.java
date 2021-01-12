import java.awt.Color;
import junit.framework.*;
import java.io.*;
import static org.junit.Assert.*;


public class TestMapEatCookie extends TestCase {
	
	public void testMapEatCookie() throws FileNotFoundException {
		MainFrame frame = new MainFrame();
		PacMan pacman = frame.addPacMan(new Location(0, 0)); 
		frame.initPlayers(); 
		frame.startGame();
		assertTrue(frame.getMap().eatCookie("pacman") == null);
		pacman.myLoc.shift(1, 1);
		assertFalse(frame.getMap().eatCookie("pacman") == null);
	}
}
