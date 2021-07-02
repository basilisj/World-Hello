package game;

import fixtures.Room;

public class Player {
	
	private Room currentRoom;
	
	
	//constructor
	public Player(Room currentRoom) {
		super();
		this.currentRoom = currentRoom;
	}
//getter and setter for current room
	public Room getCurrentRoom() {
	return currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
}
