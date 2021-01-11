# Project 1: PacMan
## 1. Group Members: 
 * Aymen Mehai
 * Leonel Santos 
 * Yair Bar
 * Zachary Santamaria

## 2. Running the Code
___
This code could be run from the command line by using the following commands.
```bash
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```
## 3 Running the Tests
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
  + Description: Need to add description.

- **move()**
  + Type: `() -> Bool`
  + Description: Need to add description. 

- **is_ghost_in_range()**
  + Type: `() -> Bool`
  + Description: Need to add description. 
  
- **consume()**
  + Type: `() -> JComponent`
  + Description: Need to add description.
  
### 4.2 Ghost Class
- **get_valid_moves()**
  + Type: `() -> ArrayList<Location>`
  + Description: Need to add description.

- **move()**
  + Type: `() -> Bool`
  + Description: Need to add description.

- **is_pacman_in_range()**
  + Type: `() -> Bool`
  + Description: Need to add description.
 
- **attack()**
  + Type: `() -> Bool`
  + Description: Need to add description.

### 4.3 Map Class
- **move(String name, Location loc, Type type)**
  + Type: `(String name, Location loc, Type type) -> Bool`
  + Description: Need to add description.

- **getLoc(Location loc)**
  + Type: `(Location loc) -> HashSet<Type>`
  + Description: Need to add description.

- **attack(String name)**
  + Type: `(String name) -> Bool`
  + Description: Need to add description.
  
- **eatCookie(String name)**
  + Type: `() -> JComponent`
  + Description: Need to add description.
