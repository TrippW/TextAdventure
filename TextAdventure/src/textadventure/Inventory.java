package textadventure;

public class Inventory {
    private Items[] inv = new Items[5];
    private final int MAX_SIZE = 5;
    public Inventory()
    {
        
    }
    
    public Item get(Item item)
    {
        for(Item i : inv)
            if(i == item)
                return i;
        return null;
    }
    
    public void remove(Room r, Item item)
    {
        for(int i = 0; i < inv.length; i++)
            if(inv[i] == item){
                inv[i] = null;
                r.put(item);
            }
    }
    
    public void add(Item item)
    {
        if(inv.length >= MAX_SIZE)
            return;
        for(int i = 0; i < inv.length; i++)
            if(inv[i] == null)
                inv[i] = item;
    }
    
    public Item[] open()
    {
        return inv;
    }
}
