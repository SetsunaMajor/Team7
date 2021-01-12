import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
		//Creating A Map 
		Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		Ghost ghost = frame.addGhost(new Location(1, 0), "name", Color.red); //Creates a red ghost named "name" at location x,y
		Ghost ghost2 = frame.addGhost(new Location(4, 4), "name", Color.blue); //Creates a blue ghost named "name" at location x,y
		PacMan pacman = frame.addPacMan(new Location(0, 0)); //Creates PacMan at location x, y

		assertTrue(ghost.is_pacman_in_range());
		assertFalse(ghost2.is_pacman_in_range());
	}
}

