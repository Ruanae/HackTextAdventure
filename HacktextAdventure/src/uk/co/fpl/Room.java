package uk.co.fpl;

import java.util.HashMap;
import java.util.Map;

public class Room {
	private final String id;
	
	private Map<Direction,String> configMap;
	
	public Room(String id)
	{
		this.id = id;
		configMap = new HashMap<>();
	}
	
	public Room(String id, String north, String south, String east, String west)
	{
		this.id = id;
		configMap = new HashMap<>();
		
		if (north != null && !north.isEmpty())
		{
			configMap.put(Direction.NORTH,north);
		}
		if (south != null && !south.isEmpty())
		{
			configMap.put(Direction.SOUTH,south);
		}
		if (east != null && !east.isEmpty())
		{
			configMap.put(Direction.EAST,east);
		}
		if (west != null && !west.isEmpty())
		{
			configMap.put(Direction.WEST,west);
		}
	}
	

	public boolean isExistsInDirection(Direction direction) {
		return configMap.containsKey(direction);
	}

	public Room getRoomInDirection(Direction direction) {
		if (isExistsInDirection(direction))
		{
			return new Room(configMap.get(direction));
		}
		return null;
	}

	public void add(String id, Direction direction) {
		configMap.put(direction, id);
		
	}

	public String getID() {
		return id;
	}
	
}