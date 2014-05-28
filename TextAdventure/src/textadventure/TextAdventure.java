package textadventure;

import java.util.Scanner;
/**
 *
 * @author Tripp
 */
public class TextAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String example = "USE STRAW ON CREEPER";
        String[] response = Parser.parse(example);
        for(String s: response)
            System.out.println(s);
        Player user = new Player();
        boolean win = false;
    	System.out.println(user.getStartText());
    	Scanner scan = new Scanner(System.in);
        while(!win)
        {
        	System.out.println("What do you do? ");
        	String input = scan.nextLine();
        	System.out.println(user.act(input));
        }
    }
}
