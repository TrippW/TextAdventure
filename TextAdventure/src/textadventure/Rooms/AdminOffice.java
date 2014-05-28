package textadventure;

public class AdminOffice extends Rooms {

    public AdminOffice()
    {
        super("Admin Office");
    }
    
    public String getDescription() {
        return "A sea of pleather stretches before you. A desk is topped by a mountain of gray plastic resembling a personal computer. Luxury as farmed to the lowest bidder.";
    }

    public void setItems() {
    }

    public void takeItem(Items itemChoice) {
//       for (int i = 0; i >= player.inventory.size(); i++) {
//            if (items[i] == itemChoice) {
//                items[i] = null;
//                // Put item into inv
//            }
//        }
    }
}
