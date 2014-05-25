/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class JDK extends Items{
    public String actionExamine(){
        return"It is a toolkit that develops java. It looks like it can help open something.";
    }
    public String actionUse(){
        for (int i = 0; i<5; i++){
           if (inventory[i] == Jar){
              if (Jar.isOpen == false) {
                  Jar.open();
              }
        }
    }
        return"There is nothing to use the JDK on.";
            
}
}