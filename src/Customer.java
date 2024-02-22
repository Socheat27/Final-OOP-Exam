public class Customer implements DiscountRate {
    private String type;

    public Customer(String type) {
        this.type = type;
    }

    @Override
    public double getServiceDiscountRate() {
        switch (type.toLowerCase()) {
            case "premium":
                return 0.20;
            case "gold":
                return 0.15;
            case "silver":
                return 0.10;
            default:
                return 0.0;
        }
    }

    @Override
    public double getProductDiscountRate() {
        switch (type.toLowerCase()) {
            case "premium":
                return 0.20;
            case "gold":
                return 0.15;
            case "silver":
                return 0.10;
            default:
                return 0.0;
        }
    }
}