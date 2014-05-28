/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

/**
 *
 * @author Nick
 */
public class Mouse extends Items {

    public String actionExamine() {
        return "Its a mouse that just ran out of the wall!";
    }

    public String use() {
        if (player.getRoom().getClass().isInstance(ServerRoom.class)) {
            return "You plugged the mouse into the terminal! You win!";
        } else {
            return "The mouse did nothing...";
        }
    }
    public String toString()
    {
        return "Mouse";
    }
}
