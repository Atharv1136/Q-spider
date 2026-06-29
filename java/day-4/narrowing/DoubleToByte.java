public class DoubleToByte {
    public static void main(String[] args) {
        double d = 127.5;
        byte b = (byte) d;
        System.out.println("Double: " + d);
        System.out.println("Byte: " + b);
        
        double d2 = 130.7;
        byte b2 = (byte) d2;
        System.out.println("Double: " + d2);
        System.out.println("Byte (overflow): " + b2);
    }
}