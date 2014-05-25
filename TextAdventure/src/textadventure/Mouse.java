/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class Mouse {
    public String actionExamine(){
        return "Its a mouse that just ran out of the wall!";
    }
    public String actionUse(){
        if (player.location() == serverRoom){
            return"You plugged the mouse into the terminal!You win!";
        }
        else{
            return"The mouse did nothing...";
        }
        }
    }
}
