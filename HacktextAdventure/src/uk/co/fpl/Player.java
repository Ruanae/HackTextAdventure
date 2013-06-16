package uk.co.fpl;
public class Player
{
	private Room position;
	
	public Player(final Room initialPosition) {
		this.position = initialPosition;
	}
	
	
	public Room getPosition() {
		return position;
	}


	public boolean move(Direction direction) {
		if (position.isExistsInDirection(direction))
		{
			position = position.getRoomInDirection(direction);
			return true;
		}
		return false;
	}
}