public class Main {
    public static void main(String[] args) {
        long[] sales = {2, 3, 9, 0, 19, 1, 7};
        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
        System.out.println(manager.trimAverage());
    }
}
