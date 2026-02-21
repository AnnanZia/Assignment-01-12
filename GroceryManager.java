import java.util.Scanner;

/**
 * GroceryManager is a grocery management system that uses
 * parallel arrays to store item names, prices, and stock quantities.
 * 
 * The program allows users to view the inventory, restock items,
 * and exit through a menu-driven interface.
 *
 */
public class GroceryManager {

    /** Runs the menu loop. */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1) View Inventory");
            System.out.println("2) Restock Item");
            System.out.println("3) Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                printInventory(itemNames, itemPrices, itemStocks);
            } else if (choice == 2) {
                System.out.print("Enter item name: ");
                String target = sc.nextLine();

                System.out.print("Enter amount: ");
                int amount = sc.nextInt();
                sc.nextLine();

                restockItem(itemNames, itemStocks, target, amount);
            } else if (choice == 3) {
                break;
            }
        }

        sc.close();
    }

    /**
    * Prints the inventory of grocery items, including their names, prices, and how many are in stock.

    * @param names An array of item names.
    * @param prices An array of item prices corresponding to the names.
    * @param stocks An array of item stock quantities corresponding to the names.
    */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(names[i] + " $" + prices[i] + " stock=" + stocks[i]);
            }
        }
    }

    /**
     * Increases the stock quantity of an existing grocery item.
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