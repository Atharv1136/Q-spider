public class DoubleToShort {
    public static void main(String[] args) {
        double d = 32767.9;
        short s = (short) d;
        System.out.println("Double: " + d);
        System.out.println("Short: " + s);
        
        double d2 = 32768.5;
        short s2 = (short) d2;
        System.out.println("Double: " + d2);
        System.out.println("Short (overflow): " + s2);
    }
}