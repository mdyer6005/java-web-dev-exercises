package studios.class03;
import java.time.LocalDate;
import java.util.*;

public class Menu {
    private String menuName;
    private ArrayList<MenuItem> menuItemList;
    private LocalDate menuLastUpdated;
    private int daysItemRemainsNew;
    private static int defaultDaysToRemainNew = 90;

    public String getMenuName() {
        return this.menuName;
    }

    public void setMenuName(String aMenuName) {
        this.menuName = aMenuName;
    }

    public ArrayList<MenuItem> getMenuItemList() {
        return this.menuItemList;
    }

    public void setMenuItemList(ArrayList<MenuItem> aMenuItemList) {
        this.menuItemList = aMenuItemList;
        this.menuLastUpdated = LocalDate.now();
    }

    public LocalDate getMenuLastUpdated() {
        return this.menuLastUpdated;
    }

    public void setMenuLastUpdated(LocalDate newUpdatedDate) {
        this.menuLastUpdated = newUpdatedDate;
    }

    public int getDaysItemRemainsNew() {
        return this.daysItemRemainsNew;
    }

    public void setDaysItemRemainsNew(int aDaysItemRemainsNew) {
        this.daysItemRemainsNew = aDaysItemRemainsNew;
    }

    public void addMenuItems(MenuItem...newMenuItems) {
        for (MenuItem item : newMenuItems) {
            this.menuItemList.add(item);
        }
        this.setMenuLastUpdated(LocalDate.now());
    }

    public Menu(String menuName, ArrayList<MenuItem> menuItems, int daysItemRemainsNew) {
        this.setMenuName(menuName);
        this.setMenuItemList(menuItems);
        this.setDaysItemRemainsNew(daysItemRemainsNew);
    }

    public Menu(String menuName, int daysItemRemainsNew) {
        this(menuName, new ArrayList<MenuItem>(), daysItemRemainsNew);
    }

    public Menu(String menuName) {
        this(menuName, new ArrayList<MenuItem>(), defaultDaysToRemainNew);
    }

    public boolean itemIsNew(MenuItem checkItem) {
        if (checkItem.getDateAdded().plusDays(this.daysItemRemainsNew).isBefore(LocalDate.now())) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder returnString = new StringBuilder("\nMenu Name:\t\t" + this.getMenuName() +
                "\nLast Updated:\t" + this.getMenuLastUpdated() + "\nMenu Items:\n---------------");

        if (this.menuItemList.size() >= 1) {
            for (MenuItem item : this.menuItemList) {
                returnString.append("\n");
                returnString.append(item.toString());
                returnString.append("New Item:\t\t");
                returnString.append(itemIsNew(item));
                returnString.append("\n");
            }
        } else {
            returnString.append("\nThere are no menu items yet");
        }
        return returnString.toString();
    }
}
