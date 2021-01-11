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

		Location left = myLoc.shift(-1, 0);
		Location right = myLoc.shift(1, 0);
		Location up = myLoc.shift(0, 1);
		Location down = myLoc.shift(0, -1);

		if (!myMap.getLoc(left).contains(Map.Type.WALL))
			possible_moves.add(left);
			
		if (!myMap.getLoc(right).contains(Map.Type.WALL))
			possible_moves.add(right);

		if (!myMap.getLoc(up).contains(Map.Type.WALL))
			possible_moves.add(up);

		if (!myMap.getLoc(down).contains(Map.Type.WALL))
			possible_moves.add(down);

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
