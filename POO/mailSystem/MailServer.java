package POO.mailSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class MailServer
{
    private List<MailItem> items;
    
    public MailServer()
    {
        items = new ArrayList<>();
    }

    
    public int howManyMailItems(String who)
    {
        int count = 0;
        for(MailItem item : items) {
            if(item.getTo().equals(who)) {
                count++;
            }
        }
        return count;
    }

    public MailItem getNextMailItem(String who)
    {
        Iterator<MailItem> it = items.iterator();
        while(it.hasNext()) {
            MailItem item = it.next();
            if(item.getTo().equals(who)) {
                it.remove();
                return item;
            }
        }
        return null;
    }

    public void post(MailItem item)
    {
        items.add(item);
    }
}