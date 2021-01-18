import java.awt.Color;
import junit.framework.*;
import java.io.*;
import static org.junit.Assert.*;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Ghost newGhost = frame.addGhost(new Location(5, 5), "newGhost", Color.red);

		assertTrue(newGhost.get_valid_moves().size() != 0);
	}
}
