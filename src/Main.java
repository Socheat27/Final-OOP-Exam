public class Main {
    public static void main(String[] args) {

        Customer premiumCustomer = new Customer("premium");
        Sale premiumSale = new Sale(100, 200, premiumCustomer);
        double totalAmount = premiumSale.calculateTotalAmount();
        System.out.printf("Total Amount for Premium Customer: $%.2f%n", totalAmount);

        Customer silverCustomer = new Customer("silver");
        Sale silverSale = new Sale(100, 200, silverCustomer);
        double totalAmountSilver = silverSale.calculateTotalAmount();
        System.out.printf("Total Amount for Silver Customer: $%.2f%n", totalAmountSilver);

        Customer normalCustomer = new Customer("normal");
        Sale normalSale = new Sale(100, 200, normalCustomer);
        double totalAmountNormal = normalSale.calculateTotalAmount();
        System.out.printf("Total Amount for Normal Customer: $%.2f%n", totalAmountNormal);
    }
}
