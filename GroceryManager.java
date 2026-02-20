import java.util.Scanner;

/** Grocery management system using parallel arrays. */
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

    /** Prints non-null inventory slots. */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(names[i] + " $" + prices[i] + " stock=" + stocks[i]);
            }
        }
    }

    /** Adds stock to a matching item name or prints "Item not found." */
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