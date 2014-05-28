package textadventure;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class Cabinet extends Items{
    
    private boolean isLocked;
    
    public Cabinet(Items i, boolean locked)
    {
        isLocked = locked;
    }
    public ArrayList<Items> cabinet = new ArrayList<Items>();
        public String actionExamine(){
            if (player.inventory.size() < 5){
                for(int i = 0;i < 5; i++){
                    if (player.inventory.get(i) == null){
                        Letter Letter = new Letter();
                         player.inventory.add(Letter);
                    }
                }
                 return "You opened the cabinet and found a letter!";
        }
            return"You opened the cabinet and found a letter. However your inventory is full.";
    }
}
