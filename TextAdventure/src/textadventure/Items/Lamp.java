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
public class Lamp extends Items{

    public String actionExamine(){
        return "It  is a lamp that burns brightly.";
    }
    public String actionUse(){
        return "The lamp illuminated the room.";
    }
    public String toString()
    {
        return "Lamp";
    }
}
