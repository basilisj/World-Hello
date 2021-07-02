package game;

import java.util.Scanner;



public class Main {

	private static	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		RoomManager manager = new RoomManager();
		manager.init();
		
		Player player = new Player(manager.startingRoom);
		
		while (true) {
			printRoom(player);
			String[]  command = collectInput();
			parse(collectInput(), player);
		}
		
	}

	



	private static void printRoom(Player player) {

		System.out.println(player.getCurrentRoom().toString() +"\n");
		System.out.println("What direction do you want to go?");
	}
	
	private static String[] collectInput() {
	
		
		return scan.nextLine().split(" ");
		}
		


	
	private static void parse(String[] command, Player player) {
		switch  (command[0]) {
		case "go":
			
		player.setCurrentRoom(player.getCurrentRoom().getExit(command[1]));
		break;
		
		default:
			break;
		}
	}
}
