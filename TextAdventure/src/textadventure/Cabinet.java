
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
    public ArrayList<Items> cabinet = new ArrayList<Items>();
        public String actionExamine(){
            if (inventory.length<5){
                for(int i = 0;i < 5; i++){
                    if (inventory[i] == null){
                        Letter Letter = new Letter();
                         inventory[i] = Letter;
                    }
                }
                 return"You opened the cabinet and found a letter!";
        }
            return"You opened the cabinet and found a letter. However your inventory is full.";
    }
}
