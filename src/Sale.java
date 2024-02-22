public class Sale {
    private double serviceAmount;
    private double productAmount;
    private Customer customer;

    public Sale(double serviceAmount, double productAmount, Customer customer) {
        this.serviceAmount = serviceAmount;
        this.productAmount = productAmount;
        this.customer = customer;
    }

    public double calculateTotalAmount() {
        double serviceDiscount = serviceAmount * customer.getServiceDiscountRate();
        double productDiscount = productAmount * customer.getProductDiscountRate();

        return serviceAmount - serviceDiscount + productAmount - productDiscount;
    }
}