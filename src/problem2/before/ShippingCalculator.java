package problem2.before;

public class ShippingCalculator {
    public double cost(String carrier, double weightKg) {
        if (carrier.equals("STANDARD")) {
            return 20 + 5 * weightKg;
        } else if (carrier.equals("EXPRESS")) {
            return 50 + 8 * weightKg;
        } else if (carrier.equals("DRONE")) {
            if (weightKg > 2) {
                throw new IllegalArgumentException("Too heavy");
            }
            return 80;
        } else if (carrier.equals("PICKUP")) {
            return weightKg < 5 ? 0.0 : 10.0;
        }
        throw new IllegalArgumentException("Unknown carrier: " + carrier);
    }
}