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

		return null;
	}

	public boolean move() {
		ArrayList<Location>valid_moves = new ArrayList<Location>();
		valid_moves = get_valid_moves();
		Map.Type t = null;
		
		if(valid_moves == null){
			return false;
		}

		myLoc.shift(valid_moves.get(0).x, valid_moves.get(0).y);
		if(myMap.getLoc(myLoc).contains(Map.Type.COOKIE)){
			t = Map.Type.COOKIE;
		} else if (myMap.getLoc(myLoc).contains(Map.Type.EMPTY)){
			t = Map.Type.EMPTY;
		} else if (myMap.getLoc(myLoc).contains(Map.Type.GHOST)){
			t = Map.Type.GHOST;
		}

		myMap.move(myName, myLoc, t);

		return true;
	}

    /* Will use the map provided and call the get function. Given the location 
     * we can call the shift method to check what is on that cordinate and check
     * for types. 
     */
	public boolean is_ghost_in_range() { 
        if (myMap.get(myLoc.shift(0,1)).contains(Map.Type.GHOST) || 
            myMap.get(myLoc.shift(1,0)).contains(Map.Type.GHOST) || 
            myMap.get(myLoc.shift(-1,0)).contains(Map.Type.GHOST) || 
            myMap.get(myLoc.shift(0,-1)).contains(Map.Type.GHOST)) {
                return true;
        }

		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
