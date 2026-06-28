class Narrowing {
    public static void main(String[] args) {

        byte b = (byte) 1000;
        System.out.println(b);

        short s = (short) 100000;
        System.out.println(s);

        long l = (long) 10000000000L;
        System.out.println(l);

        float f = (float) 10000000000.0;
        System.out.println(f);

        char c = (char) 1000;
        System.out.println(c);

    }
}