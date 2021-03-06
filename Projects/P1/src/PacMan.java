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
		ArrayList<Location> possible_moves = new ArrayList<Location>();
		ArrayList<Location> possible_moves2 = new ArrayList<Location>();
			possible_moves.add(myLoc.shift(1,0));
			possible_moves.add(myLoc.shift(0,1));
			possible_moves.add(myLoc.shift(-1,0));
			possible_moves.add(myLoc.shift(0,-1));
		for (Location l : possible_moves) {
			if (!myMap.getLoc(l).contains(Map.Type.WALL)) {
				possible_moves2.add(l);
			}
		}
		return possible_moves2;
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

    /* Will use the map provided and call the get function. Given the location 
     * we can call the shift method to check what is on that cordinate and check
     * for types. 
     */
	public boolean is_ghost_in_range() { 
		if (myMap.getLoc(myLoc.shift(0,1)).contains(Map.Type.GHOST) || 
            	myMap.getLoc(myLoc.shift(1,0)).contains(Map.Type.GHOST) || 
           	myMap.getLoc(myLoc.shift(-1,0)).contains(Map.Type.GHOST) || 
           	myMap.getLoc(myLoc.shift(0,-1)).contains(Map.Type.GHOST)) {
                return true;
        	}

		return false;
	}

	public JComponent consume() { 
		return myMap.eatCookie(myName);
	}
}
