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
public class Cheese extends Items{
    public String actionExamine(){
        return"It is an old moldy cheese with a foul oder.";
    }
    public String actionUse(){
        if (player.location() == adminRoom){
          return"The cheese attracted a mouse!";
          //arraylist for the room:
          room.add(mouse);
          return"A mouse ran into the room.";
        }
        else{
            return"You just ate moldy cheese....You lost 2 points of health. Your health is at " + health;
        }
    }
}
