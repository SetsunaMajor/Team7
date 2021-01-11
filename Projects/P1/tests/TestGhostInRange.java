import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
		return null;
        
        NoFrame frame = new NoFrame();

		// Create a ghost
		frame.addGhost(new Location(12, 12), "Pinky", Color.pink); //right
		frame.addGhost(new Location(9, 10), "Pinky", Color.pink); // left
		frame.addGhost(new Location(9, 10), "Pinky", Color.pink); // up
		frame.addGhost(new Location(3, 2), "Pinky", Color.pink); // down
		
		PacMan player = frame.addPacMan(new Location(11, 12));

		PacMan player2 = frame.addPacMan(new Location(10, 10));
		PacMan player3 = frame.addPacMan(new Location(9, 9));
		PacMan player4 = frame.addPacMan(new Location(3, 3));

		assertTrue("PacMan at (" + 11 + ", " + 12 + ") in range of a ghost", 
                player.is_ghost_in_range());

		assertTrue("PacMan at (" + 10 + ", " + 10 + ") in range of a ghost", 
                player2.is_ghost_in_range());
		assertTrue("PacMan at (" + 9 + ", " + 9 + ") in range of a ghost", 
                player3.is_ghost_in_range());
		assertTrue("PacMan at (" + 3 + ", " + 3 + ") in range of a ghost", 
                player4.is_ghost_in_range());
		// Test a scenario where the pacman is in a corner of the map
		frame.addGhost(new Location(1, 2), "Pinky", Color.pink);
		PacMan player = frame.addPacMan(new Location(1, 1));

		assertTrue(player.is_ghost_in_range());

}

