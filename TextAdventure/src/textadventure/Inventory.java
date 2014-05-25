package textadventure;

public class Inventory {
    private Items[] inv = new Items[5];
    private final int MAX_SIZE = 5;
    public Inventory()
    {
        
    }
    
    public Items get(Items item)
    {
        for(Items i : inv)
            if(i == item)
                return i;
        return null;
    }
    
    public void remove(Room r, Items item)
    {
        for(int i = 0; i < inv.length; i++)
            if(inv[i] == item){
                inv[i] = null;
                r.put(item);
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
