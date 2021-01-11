import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
		//Creating A Map 
		Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(0, 0)); //Creates PacMan at location x, y

		//alternatively if you don't need the PacMan or Ghost objects in your tests
		frame.initPlayers(); //Creates all of the players

		//Start The Game
		frame.startGame();

		AssertTrue(pacman.move());

		pacman.shift(50, 50);

		AssertFalse(pacman.move());
	}
}
