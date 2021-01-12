import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;


public class TestMapGetLoc {
	
	public void testMapGetLoc() {
		NoFrame frame = new NoFrame();  
		PacMan pacman = frame.addPacMan(new Location(5, 5)); 
		Map map = frame.getMap(); 

		HashSet<Map.Type> pacmanSet = new HashSet<Map.Type>();

		pacmanSet.add(Map.Type.PACMAN);

		assertEquals(map.getLoc(new Location(5, 5)), pacmanSet);
	}
}
