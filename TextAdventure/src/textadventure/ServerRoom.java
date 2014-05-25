package textadventure;

public class ServerRoom extends Rooms {

    public ServerRoom() {
        super("Server Room");
    }

    public String getDescription() {
        return "This room contains significant IT infrastructure. Within the ancient racks, there lies a terminal.  Try not to trip on the cable. ";
    }

    public void setItems() {
    }

    public void takeItem(Items itemChoice) {
//		for(int i=0; i>=items.length(); i++)
//		{
//			if(items[i] == iteamChoice)
//			{
//				items[i] = null;
//				// Put item into inv
//			}
//		}
    }
}
