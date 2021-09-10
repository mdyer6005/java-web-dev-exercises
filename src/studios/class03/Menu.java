package studios.class03;

import java.util.*;

public class Menu {
    private String menuName;
    private ArrayList<MenuItem> itemList;
    private Date menuLastUpdated;

    public boolean itemIsNew(MenuItem checkItem) {
        int daysToRemainNew = 90;
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DAY_OF_MONTH, -(daysToRemainNew + 1));
        Date lastDateForNewItem = calendar.getTime();
        if (checkItem.getDateAdded().after(lastDateForNewItem)) {
            return true;
        }
        return false;
    }

}
