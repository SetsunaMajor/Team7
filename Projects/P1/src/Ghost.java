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
		return null;
	}

	public boolean move() {
		
		ArrayList<Location> valid_moves = get_valid_moves();
		
		if (valid_moves.size() < 1) {
            return false;
        }

        Random r = new Random();
        int random_loc = r.nextInt(valid_moves.size() - 1);
		myLoc = valid_moves.get(random_loc);
        myMap.move(myName, myLoc, Map.Type.GHOST);
		
        return true;
		
	}

	public boolean is_pacman_in_range() { 
		return false;
	}

	public boolean attack() {
		return false;
	}
}
