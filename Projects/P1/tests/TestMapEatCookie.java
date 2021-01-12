import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;


public class TestMapEatCookie {
	
	public void testMapEatCookie() {
		//Creating A Map 
		MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(0, 0)); //Creates PacMan at location x, y

		//alternatively if you don't need the PacMan or Ghost objects in your tests
		frame.initPlayers(); //Creates all of the players

		//Start The Game
		frame.startGame();

		assertTrue(frame.getMap().eatCookie("pacman") == null);

		pacman.myLoc.shift(1, 1);
		
		assertFalse(frame.getMap().eatCookie("pacman") == null);
	}
}
