import java.util.Scanner;

/** Grocery management system using parallel arrays. */
public class GroceryManager {

    /** Runs the menu loop. */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];
    }
    /**
     * Increases the stock quantity of an existing grocery item.
     * <p>
     * The method searches for the given item name in the array.
     * If a matching item is found, its corresponding stock value is increased
     * by the specified amount. If the item does not exist in the inventory,
     * an error message is printed.
     *
     * @param names  an array containing the names of grocery items
     * @param stocks an array containing stock quantities corresponding to each item
     * @param target the name of the item to restock
     * @param amount the number of units to add to the item's stock
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equals(target)) {
                stocks[i] += amount;
                return;
            }
        }
        System.out.println("Item not found.");
    }
}