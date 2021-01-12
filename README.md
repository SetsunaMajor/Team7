# Project 1: PacMan
## 1. Group Members: 
 * Aymen Mehai
 * Leonel Santos 
 * Yair Bar
 * Zachary Santamaria

![PacMan](https://github.com/cmsc388T/Team7/blob/main/Projects/P1/tests/Capture.PNG)


## 2. Running the Code
This code could be run from the command line by using the following commands.
```bash
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```
## 3. Running the Tests
```bash
javac -cp "tests/junit-4.10.jar:src/:tests/" src/*.java tests/*.java
java -cp "tests/junit-4.10.jar:src/:tests/" org.junit.runner.JUnitCore testname
ex: java -cp "tests/junit-4.10.jar:src/:tests/" org.junit.runner.JUnitCore TestGhostMove
```
Make sure to run these commands from inside the P1 directory

## 4. Functions Explanation
### 4.1 PacMan Class
- **get_valid_moves()**
  + Type: `() -> ArrayList`
  + Description: This method returns all the valid moves that PacMan can make given his current position. We check left, right, up, and down to ensure that it is not a wall. The test for this shows that PacMan can move at the start of the game. 

- **move()**
  + Type: `() -> Bool`
  + Description: Changes the location of PacMan to a valid location if possible. JUnit tests verify that the function returns true when a valid location is available, and false otherwise.

- **is_ghost_in_range()**
  + Type: `() -> Bool`
  + Description: Checks to see if ghosts are in range. Will return true if there is at least one otherwise false.  
  
- **consume()**
  + Type: `() -> JComponent`
  + Description: If there is a cookie at this current location then consumes that cookie. Returns the cookie if eating was successful otherwise it returns null.
  
### 4.2 Ghost Class
- **get_valid_moves()**
  + Type: `() -> ArrayList<Location>`
  + Description: Finds the valid moves around the ghost.

- **move()**
  + Type: `() -> Bool`
  + Description: This method utilizes the `get_valid_moves()` method to verify that there is a position to move to. The priority is moving towards cookies or empty. If there are no cookies or empty locations near the ghost he will just move in any direction. The test for this shows the ghost being able to move given at the start of the game and not being able to move when placed in a location not on the grid.

- **is_pacman_in_range()**
  + Type: `() -> Bool`
  + Description: Returns true if PacMan is in in range (within a radius of 1). JUnit tests verify that function returns true when PacMan is indeed in range, and false otherwise.
 
- **attack()**
  + Type: `() -> Bool`
  + Description: Test to see if pacman is in range. It will return that methods results.

### 4.3 Map Class
- **move(String name, Location loc, Type type)**
  + Type: `(String name, Location loc, Type type) -> Bool`
  + Description: with the given paramters will try to see if it is possible to make a move. 

- **getLoc(Location loc)**
  + Type: `(Location loc) -> HashSet<Type>`
  + Description: Returns the hashset of the type located on the given location.

- **attack(String name)**
  + Type: `(String name) -> Bool`
  + Description: We have to first verify that there is a ghost with the given name. If there is then we use the methods from Ghost.java to see if PacMan is in range and if he is then the ghost will attack and the game will be updated to over, returning true. Otherwise it returns false. 
  
- **eatCookie(String name)**
  + Type: `() -> JComponent`
  + Description: Updates locations, field, components, and cookies counter variable inside the map class to remove the eaten cookie from the map. JUnit tests verify that a cookie is eaten when supposed to, and function returns null when not on a cookie.
