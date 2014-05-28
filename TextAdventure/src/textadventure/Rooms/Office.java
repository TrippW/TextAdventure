package textadventure;

public class Office extends Rooms {

    public Office(String name) {
        super(name);
    }

    public String getDescription() {
        return "The Room is dark and damp. To your North is a Cabinet. To your East is a desk with a latern on it. To your south is another Cabinet. To your west is a door.";
    }
}
