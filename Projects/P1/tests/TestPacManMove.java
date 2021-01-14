import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
		//Creating A Map 
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y
		assertTrue(pacman.move());
		PacMan pacman2 = frame.addPacMan(new Location(50,50));
		assertFalse(pacman2.move());
	}
}
