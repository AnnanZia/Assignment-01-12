public class GroceryManager {
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];
    }
    
    public static void restockItem(String[] names, int[] stocks, String target, int amount){
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equals(target)){
                stocks[i] += amount;
                return;
            }
        }
        System.out.println("Item not found.");
    }
}
