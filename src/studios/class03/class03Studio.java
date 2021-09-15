package studios.class03;
import java.time.LocalDate;
import java.util.ArrayList;

public class class03Studio {
    public static void main(String[] args) {
        LocalDate date45Ago = LocalDate.now().minusDays(45);
        LocalDate date90Ago = LocalDate.now().minusDays(90);
        LocalDate date91Ago = LocalDate.now().minusDays(91);
        LocalDate date375Ago = LocalDate.now().minusDays(375);

        MenuItem item1 = new MenuItem(1, "Steak Tacos", "3 steak tacos with cheese", "entree", 12.99);
        MenuItem item2 = new MenuItem(2, "Queso Dip", "yellow cheese dip", "appetizer", 7.99, date91Ago);
        MenuItem item3 = new MenuItem(3, "Ice Cream", "chocolate ice cream", "dessert", 5.99, date90Ago);
        MenuItem item4 = new MenuItem(4, "Tamales", "3 pork tamales", "entree", 10.99, date375Ago);

        Menu tastyMenu = new Menu("Mexican Menu");
        System.out.println(tastyMenu);

        tastyMenu.addMenuItems(item1, item2, item3, item4);
        System.out.println(tastyMenu);

        ArrayList<MenuItem> onlyThreeItems = new ArrayList<MenuItem>();
        onlyThreeItems.add(item1);
        onlyThreeItems.add(item2);
        onlyThreeItems.add(item3);

        Menu hasToBeVeryNew = new Menu("Trendy Menu", onlyThreeItems, 7);
        System.out.println(hasToBeVeryNew);

    }
}
