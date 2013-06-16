package uk.co.fpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextAdventure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Room start = new Room("Starting Room", "Room N", "Room S", null, null);

		Player player = new Player(start);

		System.out.println("Starting in " + player.getPosition().getID());

		boolean run = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (run) {
			System.out.println("Enter a command");
			try {
				String value = br.readLine();

				switch (value) {
				case "Exit":
					run = false;
					break;
				case "North":
					if (player.move(Direction.NORTH))
					{
						System.out.println("Now in "+player.getPosition().getID());
					}
					else
					{
						System.out.println("You can't move in that direction");
					}
		
					break;
				case "South":
					if (player.move(Direction.SOUTH))
					{
						System.out.println("Now in "+player.getPosition().getID());
					}
					else
					{
						System.out.println("You can't move in that direction");
					}
					break;
				case "West":
					if (player.move(Direction.WEST))
					{
						System.out.println("Now in "+player.getPosition().getID());
					}
					else
					{
						System.out.println("You can't move in that direction");
					}
					break;
				case "East":
					if (player.move(Direction.EAST))
					{
						System.out.println("Now in "+player.getPosition().getID());
					}
					else
					{
						System.out.println("You can't move in that direction");
					}
					break;
				default:
					System.out.println("I don't know what you mean");
					break;

				}
				System.out.println("");

			} catch (IOException ioe) {
				System.out.println("IO error trying to read your name!");
				System.exit(1);
			}
		}

	}

}
