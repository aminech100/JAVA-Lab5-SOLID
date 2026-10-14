package problem2.after;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(2.0);

        List<ShippingMethod> methods = Arrays.asList(
                new StandardShipping(),
                new ExpressShipping(),
                new DroneShipping(),
                new PickupShipping()
        );

        for (ShippingMethod method : methods) {
            double cost = parcel.shippingCost(method);
            System.out.printf("%s: %.2f MAD%n", method.name(), cost);
        }
    }
}