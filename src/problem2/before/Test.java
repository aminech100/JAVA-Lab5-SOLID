package problem2.before;

public class Test {
    public static void main(String[] args) {
        ShippingCalculator calc = new ShippingCalculator();

        System.out.println("Standard: " + calc.cost("STANDARD", 2.0) + " MAD");
        System.out.println("Express: " + calc.cost("EXPRESS", 2.0) + " MAD");
        System.out.println("Drone: " + calc.cost("DRONE", 2.0) + " MAD");
        System.out.println("Pickup: " + calc.cost("PICKUP", 2.0) + " MAD");
    }
}