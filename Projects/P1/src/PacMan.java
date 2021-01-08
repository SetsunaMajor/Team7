import java.util.HashSet;
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
		
		ArrayList<Location> possible_moves = new ArrayList<Location>();
			possible_moves.add(myLoc.shift(1,0));
			possible_moves.add(myLoc.shift(0,1));
			possible_moves.add(myLoc.shift(-1,0));
			possible_moves.add(myLoc.shift(0,-1));

		for (Location l : possible_moves) {
			if (myMap.getLoc(l).contains(Map.Type.WALL)) {
				possible_moves.remove(l);
			}
		}
		return possible_moves;
		
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
