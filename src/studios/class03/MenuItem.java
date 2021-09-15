package studios.class03;
import java.text.NumberFormat;
import java.time.LocalDate;

public class MenuItem {
    private int itemId;
    private String itemName;
    private String description;
    private String category;
    private double itemPrice;
    private LocalDate dateAdded;
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int aItemId) {
        this.itemId = aItemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String aItemName) {
        this.itemName = aItemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double aItemPrice) {
        this.itemPrice = aItemPrice;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate aDateAdded) {
        this.dateAdded = aDateAdded;
    }

    public MenuItem (int menuIdNumber, String itemName, String description, String category, double price, LocalDate dateAdded) {
        this.itemId = menuIdNumber;
        this.itemName = itemName;
        this.description = description;
        this.category = category;
        this.itemPrice = price;
        this.dateAdded = dateAdded;
    }

    public MenuItem (int menuIdNumber, String itemName, String description, String category, double price) {
        this(menuIdNumber,itemName, description, category, price, LocalDate.now());
        //this(menuIdNumber,itemName, description, category, price, new GregorianCalendar().getTime());
    }

    public String toString() {
        return "Id:\t\t\t\t" + this.getItemId() + "\nName:\t\t\t" + this.getItemName() + "\nDescription:\t" +
                this.getDescription() + "\nCategory:\t\t" + this.getCategory() + "\nPrice:\t\t\t" +
                currencyFormatter.format(this.getItemPrice()) + "\nCreated:\t\t" +
                this.getDateAdded() + "\n";
    }

}
