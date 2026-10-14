package problem2.after;

public class PickupShipping implements ShippingMethod {
    @Override
    public String name() {
        return "Pickup";
    }

    @Override
    public double cost(double weightKg) {
        return weightKg < 5 ? 0.0 : 10.0;
    }
}