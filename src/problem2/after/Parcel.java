package problem2.after;

public class Parcel {
    private double weightKg;

    public Parcel(double weightKg) {
        this.weightKg = weightKg;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public double shippingCost(ShippingMethod method) {
        return method.cost(weightKg);
    }
}