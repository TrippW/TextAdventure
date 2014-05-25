package textadventure;

import concepts.Rooms;

public class ServerRoom extends Rooms{
	public String getDescription()
	{
		return "This room contains significant IT infrastructure. Within the ancient racks, there lies a terminal.  Try not to trip on the cable. ";
	}
	
	public void setItems()
	{
    items[0] = Cabinet1 ;
    items[1] = Cabinet2;
    items[2] = Door;
	}
	public void takeItem(Iteams itemChoice)
	{
		for(int i=0; i>=items.length(); i++)
		{
			if(items[i] == iteamChoice)
			{
				items[i] = null;
				// Put item into inv
			}
		}
	}
}
