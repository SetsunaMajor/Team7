import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;

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
		ArrayList<Location> valid_ghost_moves2 = new ArrayList<Location>();
        valid_ghost_moves.add(myLoc.shift(0,1));
        valid_ghost_moves.add(myLoc.shift(1,0));
        valid_ghost_moves.add(myLoc.shift(0,-1));
        valid_ghost_moves.add(myLoc.shift(-1,0));
        for (Location l : valid_ghost_moves) {
            if (!myMap.getLoc(l).contains(Map.Type.WALL)) {
                valid_ghost_moves2.add(l);
            }
        }

        return valid_ghost_moves;

    	}

	public boolean move() {
		ArrayList<Location> valid_moves = get_valid_moves();
		int random_loc = 0;
		Random r = new Random();

		if(valid_moves.size() != 0){
			return false;
		}
		random_loc = r.nextInt(valid_moves.size());
		myLoc = valid_moves.get(random_loc);
        	myMap.move(myName, myLoc, Map.Type.GHOST);
        	return true;
	}

	public boolean is_pacman_in_range() {

		if (myMap.getLoc(myLoc.shift(0,1)).contains(Map.Type.COOKIE) ||
		myMap.getLoc(myLoc.shift(1,0)).contains(Map.Type.COOKIE) ||
		myMap.getLoc(myLoc.shift(-1,0)).contains(Map.Type.COOKIE) ||
		myMap.getLoc(myLoc.shift(0,-1)).contains(Map.Type.COOKIE)) {
			return true;
	}

		return false;
	}

	public boolean attack() {
		if (is_pacman_in_range() == true) {
			myMap.attack(myName);
			return true;
		}

		return false;
	}
}
