package textadventure;

import concepts.Rooms;

public class StorageRoom extends Rooms{
	
	public String getDescription()
	{
		return "Carcinogenic solvents, mops, brooms, and, inexplicably, an axe. There is a faint squeaking. Obviously, no one came in here much.";
	}

	public void getItems()
	{
    items[0] = Cabinet1 ;
    items[1] = Cabinet2;
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
