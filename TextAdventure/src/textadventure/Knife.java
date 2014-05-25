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
public class Knife extends Items
{

    public String actionUse(){
        return "You swung the knife and it broke!";
    }
    public String actionExamine(){
        return "A very old knife. It is dull and rusted.";
    }
    public String toString()
    {
        return "Knife";
    }
}
