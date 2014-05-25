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
public class Jar extends Items{
    public boolean isOpen = false;
    public String actionExamine(){
        return"It is a plastic jar with a tight lid.";
    }
    public String actionUse(){
        return"The lid is to tight to open!";
    }
    public static String open(){
        boolean isOpen = true;
        return"The jar was opened!";
    }
    public String toString()
    {
        return "Jar";
    }
}
