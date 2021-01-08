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
		return false;
	}

    /* Will use the map provided and call the get function. Given the location 
     * we can call the shift method to check what is on that cordinate and check
     * for types. 
     */
	public boolean is_ghost_in_range() { 
        if (myMap.get(myLoc.shift(0,1)) == Map.Type.GHOST || 
            myMap.get(myLoc.shift(1,0)) == Map.Type.GHOST || 
            myMap.get(myLoc.shift(-1,0)) == Map.Type.GHOST || 
            myMap.get(myLoc.shift(0,-1)) == Map.Type.GHOST) {
                return true;
        }

		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
