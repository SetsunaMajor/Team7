import java.awt.Color;
import junit.framework.*;
import java.io.*;
import static org.junit.Assert.*;

public class TestMapMove extends TestCase {

	public void testMapMove() throws FileNotFoundException {
		NoFrame frame = new NoFrame(); 
		Ghost ghost1 = frame.addGhost(new Location(2, 2), "ghost1", Color.BLACK);
		assertTrue(frame.getMap().move("ghost1", new Location(2, 1), Map.Type.GHOST));
	}
}
