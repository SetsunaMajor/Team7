import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;

public class TestAttack extends TestCase {

	public void testAttack() throws FileNotFoundException{
	    NoFrame frame = new NoFrame();

		Ghost ghost = frame.addGhost(new Location (10,10), "ghost", Color.WHITE);
		PacMan pac = frame.addPacMan(new Location (10,9));
		assertFalse(ghost.attack());
	}
}
