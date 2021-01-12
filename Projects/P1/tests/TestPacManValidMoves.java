import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();

		PacMan pacman = frame.addPacMan(new Location(3, 3));
		assertTrue(pacman.get_valid_moves().size() !=  0);

	}
}
