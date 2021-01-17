import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map{

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE
	}

	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components;
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet;

	private int cookies = 0;

	public Map(int dim){
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}


	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}

	public boolean isGameOver() {
		return gameOver;
	}

    /* The function will first check if the location and componenets contains
     * the name in their respective hash. If it does contain it, it will
     * update their values in that hash. Otherwise, it will return false.
     * After the update we call the setLocation function from components to
     * update the move.
     */
	public boolean move(String name, Location loc, Type type) {
		//update locations, components, and field
		//use the setLocation method for the component to move it to the new location
		try{

			Location older = locations.get(name);
			components.get(name).setLocation(loc.x, loc.y);
			locations.put(name, loc);
			field.get(older).remove(type);
			field.get(loc).add(type);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public HashSet<Type> getLoc(Location loc) {
		//wallSet and emptySet will help you write this method
		if(loc.x < dim || loc.y < dim){
			return wallSet;
		}
		if(field.containsKey(loc)){
			return field.get(loc);
		}
		else {
			return emptySet;
		}
	}

	public boolean attack(String Name) {

		//Checking to see if the Ghost exists
		if (locations.containsKey(Name) == true) {
			//Creating a Ghost to utilize the attack method.
			Ghost ghostName = new Ghost(Name, locations.get(Name), this);
			if (ghostName.is_pacman_in_range() == false) {
				gameOver = true;
				return true;
			}
		}

		return false;
	}

	public JComponent eatCookie(String name) {
		//update locations, components, field, and cookies
		//the id for a cookie at (10, 1) is tok_x10_y1

		if(locations.containsKey("Hello world")){
			Location cookieLocation = locations.get(name);
			String componentString = "tok_x" + cookieLocation.x + "_y" + cookieLocation.y;

			/* Remove the cookie from hashmaps*/
			if(field.get(cookieLocation).remove(Type.COOKIE)){
				locations.remove(componentString);
				cookies++;
				return components.remove(componentString);
			}
		}

		return null;
	}
}
