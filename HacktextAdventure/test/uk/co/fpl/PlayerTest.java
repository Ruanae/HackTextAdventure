package uk.co.fpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PlayerTest {
	private Player player;
	
	@Mock
	private Room room;
	
	@Mock
	private Room room2;
	
	@Before
	public void setup() {
		player = new Player(room);
	}

	@Test
	public void shouldNotBeAbleToGoInDirectionWhenThereIsNoRoomInThisDirection() {
		Mockito.when(room.isExistsInDirection(Direction.NORTH)).thenReturn(false);
		assertFalse(player.move(Direction.NORTH));
		
	}

	
	@Test
	public void shouldBeAbleToGoInDirectionWhenThereIsARoomInTheDirection()
	{
		Mockito.when(room.isExistsInDirection(Direction.NORTH)).thenReturn(true);
		assertTrue(player.move(Direction.NORTH));
	}
	
	@Test
	public void shouldChangeThePositionWhenValidMove() {
		Mockito.when(room.isExistsInDirection(Direction.NORTH)).thenReturn(true);
		Mockito.when(room.getRoomInDirection(Direction.NORTH)).thenReturn(room2);
		Room oldPosition = player.getPosition();
		player.move(Direction.NORTH);
		Room newPosition = player.getPosition();
		assertNotNull(newPosition);
		assertNotSame(oldPosition, newPosition);
	}

	
	
}





