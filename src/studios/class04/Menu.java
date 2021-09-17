package studios.class04;

import java.time.LocalDate;
import java.util.ArrayList;

import static reuse.GetInput.getInt;
import static reuse.GetInput.getInteger;

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

    // Prints entire menu
    public void printMenu() {
        System.out.println(this.toString());
    }

    // Prints a menu item by index
    public void printMenuItem(int indexToPrint) {
        try {
            System.out.println(this.menuItemList.get(indexToPrint).toString());
        } catch (NumberFormatException e) {
            System.out.println("Could not print item.");
        }
    }

    // Shows a basic list of menu items with indexes
    public void  printBasicItemList() {
        System.out.println();
        for (MenuItem item : this.menuItemList) {
            System.out.println("Index: " + this.menuItemList.indexOf(item) + "\tID: " + item.getItemId() + "\tName: " + item.getItemName());
        }
    }

    // Shows a basic list of menu items, prompts for an index, and returns that index as int
    public int selectMenuItemIndex(String promptMessage) {
        if (!(this.menuItemList.size() >= 1)) {
            throw new IndexOutOfBoundsException("There are no items in the list");
        }
        this.printBasicItemList();
        int selectedIndex = getInt(promptMessage);
        while (!(selectedIndex >= 0 && selectedIndex < this.menuItemList.size())) {
            System.out.println("\nNot a valid index.  Try again.\n");
            this.printBasicItemList();
            selectedIndex = getInt(promptMessage);
        }
        return selectedIndex;
    }

    public void deleteMenuItem(int indexToDelete) {
        try {
            this.menuItemList.remove(indexToDelete);
        } catch (NumberFormatException e) {
            System.out.println("Could not delete item.");
        }
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
