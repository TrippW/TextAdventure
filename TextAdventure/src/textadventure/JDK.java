package textadventure;

/**
 *
 * @author Nick
 */
public class JDK extends Items {

    public String actionExamine() {
        return "It is a toolkit that develops java. It looks like it can help open something.";
    }

    public String actionUse() {
        for (int i = 0; i < 5; i++) {
            if (player.inv.get(jar)!= null) {
                if (jar.isUsed == false) {
                    return jar.use();
                }
            }
        }
        return "There is nothing to use the JDK on.";
    }
    
    @Override
    public String use()
    {
        jar.isUsed = true;
        return "The JDK fits firmly into the JAR's lid. With a twist, the lid pops off. "
                + "The faint scent of molding cheese rises from the jar. "
                + "You remove the cheese from the jar";
    }
}