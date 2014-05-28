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
public class Cables extends Items{
    public String actionExamine(){
        return"It is a broken cable. There are cables like this one lying all over the floor.";
    }
    public String actionUse(){
        if (player.getHealth()>2){
            player.setHealth(player.getHealth(), -2);
            return"You try to use the cables and give yourself a mild shock. You lost some health.";
        }
        else{
            player.setHealth(player.getHealth(), -2);
            return"You played with the cables and shocked yourself. This is why you dont play with wires...you died.";
        }
    }
    
    public String toString()
    {
        return "Cables";
    }
}