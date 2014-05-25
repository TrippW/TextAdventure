package textadventure;

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
        while(true)
        {
        	user.getRoom
        }
    }
}
