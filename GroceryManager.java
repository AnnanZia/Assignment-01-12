public class GroceryManager {
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];
    }

    /**
    * Prints the inventory of grocery items, including their names, prices, and how many are in stock.

    * @param names An array of item names.
    * @param prices An array of item prices corresponding to the names.
    * @param stocks An array of item stock quantities corresponding to the names.
    */

    public static void printInventory(String[] names, double[] prices, int[] stocks) {

        for (int i = 0; i < names.length; i++) {
            if(names[i] != null) {
                System.out.println(
                "Item: " + names[i] + 
                ", Price: $" + prices[i] + 
                ", Stock: " + stocks[i]);
            }
        }
    }
}