package textadventure;

public class StorageRoom extends Rooms {

    public StorageRoom() {
        super("Storage Room");
    }

    public String getDescription() {
        return "Carcinogenic solvents, mops, brooms, and, inexplicably, an axe. There is a faint squeaking. Obviously, no one came in here much.";
    }

    public void getItems() {
    }

    public void takeItem(Items itemChoice) {
//        for (int i = 0; i >= items.length(); i++) {
//            if (items[i] == iteamChoice) {
//                items[i] = null;
//                // Put item into inv
//            }
//        }
    }
}