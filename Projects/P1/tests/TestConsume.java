import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1,1));
		assertTrue(pacman.consume() != null);

		PacMan pacman2 = frame.addPacMan(new Location(50, 50));
		assertTrue(pacman2.consume() == null);

	}
}
