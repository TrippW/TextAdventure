package textadventure;

public class Inventory {
    private Items[] inv = new Items[5];
    private final int MAX_SIZE = 5;
    public Inventory()
    {
        
    }
    
    public int size()
    {
        for(int i = 0; i < inv.length; i++)
            if(inv[i] == null)
                return i;
        return 5;
    }
    
    public Items get(int i)
    {
        return inv[i];
    }
    
    public Items get(Items item)
    {
        for(Items i : inv)
            if(i == item)
                return i;
        return null;
    }
    
    public void remove(Rooms r, Items item)
    {
        for(int i = 0; i < inv.length; i++)
            if(inv[i] == item){
                inv[i] = null;
                r.add(item);
            }
    }
    
    public void remove(Rooms r, String item)
    {
        for(int i = 0; i < inv.length; i++)
            if(inv[i].toString().equalsIgnoreCase(item)){
                r.add(inv[i]);
                inv[i] = null;
            }
    }
    
    public void add(Items item)
    {
        if(inv.length >= MAX_SIZE)
            return;
        for(int i = 0; i < inv.length; i++)
            if(inv[i] == null)
                inv[i] = item;
    }
    
    public Items[] open()
    {
        return inv;
    }
}
