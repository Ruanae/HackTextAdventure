package uk.co.fpl;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTest {

	private Room room;
	
	@Test
	public void shouldReturnNullIfNoRoomInSpecifiedDirection() {
		room = new Room("Room1");
		Room newRoom = room.getRoomInDirection(Direction.NORTH);
		assertNull(newRoom);
	}

	
	@Test
	public void shouldReturnRoomIfExistsInSpecifiedDirection()
	{
		room = new Room("Room1");
		room.add("Room2", Direction.NORTH);
		Room newRoom = room.getRoomInDirection(Direction.NORTH);
		assertEquals("Room2", newRoom.getID());
		
	}
}
