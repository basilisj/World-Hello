package fixtures;


import java.util.Arrays;
import java.util.List;

public class Room extends Fixture{

	
	private Room[] exits;
	private List<String> directions = Arrays.asList("Left", "Right", "Up", "Down"); //fixed size referring to the 
	//same elements of the array
	

	
	
	
	//constructors
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[directions.size()];
		
	}
	
	//getters and setters for exits

	public Room[] getExits() { 
		return exits;
	}

	public void setExits(Room[] exits) {
		this.exits = exits;
	}
		
	
	public Room getExit(String direction) {
		return exits[directions.indexOf(direction)];  //returns the index of the element
		
	}
	
	public List<String>getDirections(){
		return directions;
	}

	@Override
	public String toString() {
		String exits = "";
		for (String direction : this.directions) {
			if(getExit(direction) != null)
				exits+= (direction + ":" + getExit(direction).getShortDescription());
		}
		return this.getName() +":\n" + this.getLongDescription() + "\n\n" + "Exits: " +  exits;
	}

	public void setDirection(List<String> directions) {
		this.directions = directions;
	}
}
