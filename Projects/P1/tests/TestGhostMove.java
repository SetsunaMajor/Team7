import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();

		Ghost blinky = frame.addGhost(new Location(1, 1), "Blinky", Color.red);
		asserTrue(blinky.move() == true)
		Ghost bad_blinky = frame.addGhost(new Location(50, 50), "Bad Blinky", Color.red);
		asserTrue(blinky.move() == false)
	}
}
