public class DoubleToInt {
    public static void main(String[] args) {
        double d = 2147483647.9;
        int i = (int) d;
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        double d2 = 2147483648.5;
        int i2 = (int) d2;
        System.out.println("Double: " + d2);
        System.out.println("Int (overflow): " + i2);
    }
}