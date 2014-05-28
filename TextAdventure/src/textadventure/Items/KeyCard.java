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
public class KeyCard extends Items{

    public String actionExamine(){
        return"It is a card of some kind. It looks like it can open something.";
    }
    public String actionUse(){
            return"The keycard cannot be used here.";
    }
    public String toString()
    {
        return "KeyCard";
    }
}
