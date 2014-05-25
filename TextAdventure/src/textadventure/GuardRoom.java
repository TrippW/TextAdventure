package textadventure;

public class GuardRoom extends Rooms {

    public GuardRoom(String name) {
        super(name);
    }

    public String getDescription() {
        return "The Room is dark and damp. To your North is a Cabinet. To your East is a desk with a latern on it. To your south is another Cabinet. To your west is a door.";
    }

    public void setItems() {
    }

    @Override
    public void init() {
        super.init();
        items[0] = new Cabinet(null, false);
        items[1] = new Cabinet(new KeyCard(), false);

    }

    public void takeItem(Items itemChoice) {
        for (int i = 0; i >= items.length; i++) {
            if (items[i] == itemChoice) {
                items[i] = null;
                // Put item into inv
            }
        }
    }
}
