package textadventure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class Player {
    
    Inventory inventory = new Inventory();
    public int points = 0;
    public int health = 10;
    public Rooms location;
    public int turn;
    public Rooms getRoom(){
        return location;
    }
    public int getHealth(){
        return health;
    }
    public int getPoints(){
        return points;
    }
    public void setHealth(int currentH, int change){
        health = currentH - change;
    }
    private void setRoom(Rooms currentRoom){
         location = currentRoom;
    }
    public void move(int dir){
        Rooms temp = getRoom().getRoomsInDirection(dir);
        if(temp == null){
            return;
        } 
        else {
            setRoom(temp);
        }
    }
    Lamp lamp = new Lamp();
    KeyCard keycard = new KeyCard();
    Cabinet cabinet = new Cabinet(new Letter(), true);
    String[] items = new String[]{lamp.toString(), keycard.toString(), cabinet.toString()};
    
	public String act(String s){
    	String[] comds = Parser.parse(s);
    	String output = "";
    	if(comds[0].equalsIgnoreCase("inv")) output = inv();
    	else if(comds[0].equalsIgnoreCase("go")) output = go();
    	else if(comds[0].equalsIgnoreCase("use")) output = use(comds[1]);
    	else if(comds[0].equalsIgnoreCase("drop")) output = drop(comds[1]);
    	else if(comds[0].equalsIgnoreCase("examine")) output = examine(comds[1]);
    	else output = "I don't understand how to " + comds[0];
    	turn++;
    	return output;
    }
	
	public String getStartText()
	{
		return location.getDescription();
	}
	
    public String inv(){
    	String out = "";
    	for(Items i : inventory.open())
    		out += i + " ";
    	return out;
    }
    public String go(){
    	if (inventory.get(keycard) != null){
    		return "You opened the door and escape. Congrats you win!";
    	}
    	else{
    		return "The door is locked.";
    	}
    }
    public String use(String item){
    	for (int i = 0; i < 3; i++){
    		if (inventory.get(i).toString().equalsIgnoreCase(item)) return inventory.get(i).actionUse();
    	}
    	return "I can't use " + item;
    }
    public String drop(String item){
    	inventory.remove(location, item);
    	return "You dropped the " + item;
    }
    public String examine(String item){
    	if(item != null)
    	for(int i = 0; i < inventory.open().length; i++)
    	if(inventory.get(i).toString().equalsIgnoreCase(item))
    		return inventory.get(i).actionExamine();
    	return location.getDescription();
    	
    }
    
}
