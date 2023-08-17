package Java_Coding;

public enum EnumDirection {
	NORTH("North"), SOUTH("South"), EAST("East"), WEST("West");

	private String name;

	EnumDirection(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public EnumDirection left() {
		switch (this) {
		case NORTH:
			return WEST;
		case WEST:
			return SOUTH;
		case SOUTH:
			return EAST;
		case EAST:
			return NORTH;
		}
		return this;
	}

	public EnumDirection right() {

		switch (this) {
		case NORTH:
			return EAST;
		case EAST:
			return SOUTH;
		case SOUTH:
			return WEST;
		case WEST:
			return NORTH;
		}
		return this;
	}
}
