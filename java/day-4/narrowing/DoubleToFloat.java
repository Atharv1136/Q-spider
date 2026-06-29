public class DoubleToFloat {
    public static void main(String[] args) {
        double d = 3.141592653589793;
        float f = (float) d;
        System.out.println("Double: " + d);
        System.out.println("Float: " + f);
        
        double d2 = 1.7976931348623157E308;
        float f2 = (float) d2;
        System.out.println("Double (max): " + d2);
        System.out.println("Float (overflow to infinity): " + f2);
    }
}