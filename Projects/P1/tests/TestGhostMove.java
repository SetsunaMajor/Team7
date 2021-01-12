import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();

		Ghost blinky = frame.addGhost(new Location(1, 1), "Blinky", Color.red);
		assertEquals(true, blinky.move());
		Ghost bad_blinky = frame.addGhost(new Location(50, 50), "Bad Blinky", Color.red);
		assertEquals(false, bad_blinky.move());
	}
}
