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
public class Letter extends Items{
    
    public String actionExamine(){
        return"Hello and welcome Broken Bits! Beware of the many dark rooms and monsters that inhabit this builing. Good luck and please download the app for the instructions.";
    }
    public String actionUse(){
        return"Its a piece of paper and doesn't do anything...";
    }
    public String toString()
    {
        return "Letter";
    }
}
