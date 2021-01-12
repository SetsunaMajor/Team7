import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {

		return null;
	}

	public boolean move() {
		ArrayList<Location> valid_moves = get_valid_moves();
		int random_loc = 0;
		Random r = new Random();

		if(valid_moves.size() == 0){
			return false;
		}
		random_loc = r.nextInt(valid_moves.size());
		myLoc = valid_moves.get(random_loc);
        myMap.move(myName, myLoc, Map.Type.PACMAN);
		
        return true;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
