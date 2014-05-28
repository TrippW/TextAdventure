package textadventure;

public abstract class Items {

    public Player player;
    public boolean isUsed = false;
    public Items jar = new Jar(),
                 jdk = new JDK();
    
    public Items() {
        player = new Player();
    }

    public void init(Player p) {
        player = p;
    }
    
    public void upadate(Player p)
    {
        player = p;
    }
    
    public String actionUse()
    {
        return "";
    }
    
    public String actionExamine()
    {return "";}
}
