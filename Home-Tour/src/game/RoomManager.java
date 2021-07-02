package game;

import java.util.List;
import fixtures.Room;

public class RoomManager {

	Room startingRoom;
	Room[] rooms;
	
	
	//giving descriptions and exits to each room
	public void init() {
		
		//living room
		Room livingRoom = new Room("Living Room", "Spacious Living Room", 
				"This room provides spacious lounging areas to sit back with family and enjoy watching TV." + "\n"
		         +"To the right, you got the kitchen where you can grab some snacks. If you go down, it will "
						+"lead you to the master bedroom, which overlooks" +"\n" +" the city.");
		List<String> directions = livingRoom.getDirections();
		rooms = new Room[directions.size()];
		this.startingRoom = livingRoom;
		
		//kitchen
		Room kitchen = new Room("Kitchen", "The Kitchen", "In the kitchen you can prepare yourself something to eat"
				+ "or chech out the enerhy efficient appliances. To the left, it will take you to the spacious living room."
				+ "If you go down, you will enter the office where you can have the space to answer some calls"
				+ "and work from home.");
		
		//master bedroom
		Room masterBedroom = new Room("Bedroom", "Master Bedroom", "The master bedroom has many features that"
				+ "you can take advanatge of. It has a nice jacuzzi, a walk-in closet"
				+ " and its private bathroom. To the right, you have the office just in case you need to "
				+ "more work done. If you go up, you will find yourself in the living room.");
		
		//office
		Room Office = new Room("Office", "The Office", "Welcome to the multi-purpose office space. You can use this space as you"
				+ "please, whether as an office, game room or both! With lightnig fast internet, there is no need ot worry on"
				+ "streamimng or dropped zoom calls. To the left, you will enter the master bedroom. "
				+ "If you go up, you will enter the kitchen.");
		
		//directions to rooms
		rooms[directions.indexOf("Down")] = masterBedroom;
		rooms[directions.indexOf("Right")] = kitchen;
		livingRoom.setExits(rooms);
		
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("Down")] = Office;
		rooms[directions.indexOf("Left")] = livingRoom;
		kitchen.setExits(rooms);
		
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("Up")] = kitchen;
		rooms[directions.indexOf("Left")] = masterBedroom;
		Office.setExits(rooms);
		
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("Up")] = livingRoom;
		rooms[directions.indexOf("Right")] = Office;
		masterBedroom.setExits(rooms);
	}
}
