package textadventure;

public abstract class Rooms {

    String name;
    Rooms[] neighbors = new Rooms[4];
    Rooms[] rooms = new Rooms[7];
    Items[] items = new Items[10];
    public static final int NORTH = 0;
    public static final int EAST = 1;
    public static final int SOUTH = 2;
    public static final int WEST = 3;

    public Rooms(String name) {
        this.name = name;
    }

    public void init() {
        rooms[0] = new GuardRoom("Guard Room");
    }

    public void add(Items item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return;
            }
        }
    }

    public Rooms getRoomsInDirection(int dir) {
        return neighbors[dir];
    }
    
    public String getDescription()
    {
    	return "";
    }
}