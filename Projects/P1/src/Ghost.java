import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {

        ArrayList<Location> valid_ghost_moves = new ArrayList<Location>();
        valid_ghost_moves.add(myLoc.shift(0,1));
        valid_ghost_moves.add(myLoc.shift(1,0));
        valid_ghost_moves.add(myLoc.shift(0,-1));
        valid_ghost_moves.add(myLoc.shift(-1,0));
        for (Location l : valid_ghost_moves) {
            if (myMap.getLoc(l).contains(Map.Type.WALL)) {
                valid_ghost_moves.remove(l);
            }
        }

        return valid_ghost_moves;

    }

	public boolean move() {
		ArrayList<Location> valid_moves = get_valid_moves();
		Location towards = null;
		Location nothing = null;
		if (valid_moves != null) {
			for (Location l : valid_moves) {
				if (myMap.getLoc(l).contains(Map.Type.COOKIE)) {
					towards = l; 
				} else if (myMap.getLoc(l).contains(Map.Type.EMPTY)) {
					nothing = l;
				}
			}
			if (towards != null) {
				myMap.move(myName, towards, Map.Type.GHOST);
				return true;
			} else if (nothing != null) {
				myMap.move(myName, nothing, Map.Type.GHOST);
				return true;
			} else {
				myMap.move(myName, valid_moves.get(0), Map.Type.GHOST);
				return true;
			}
		} else {
			return false;
		}
	}

	public boolean is_pacman_in_range() { 
		return false;
	}

    /* Returns if pacman is nearby the current object. The is_pacman_in_range
     * does that so we will simply call that function. 
     */
	public boolean attack() {
		return this.is_pacman_in_range();
	}
}
