public class Main {
    public static void main(String[] args) {
        int[] sales = {1, 5, 3};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
