import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		CookieComponent cookie = new CookieComponent(5,5, frame.scale);
		PacMan pacman = frame.addPacMan(new Location(5, 5)); //Creates PacMan at location of cookie
		map.add("cookie", new Location(5,5),cookie,Map.Type.COOKIE);
		assertTrue(pacman.consume() == null); 

	}
}
