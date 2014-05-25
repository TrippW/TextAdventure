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
}
