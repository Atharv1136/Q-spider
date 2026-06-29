public class comparision {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int ans = a > b ? a : b;
        System.out.println(ans);

        // three numbers
        int c = 30;
        int threeans = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(threeans);

        // four numbers
        int d = 40;
        int fourans = a > b ? (a > c ? (a > d ? a : d) : (b > d ? b : d)) : (b > c ? (b > d ? b : d) : (c > d ? c : d));
        System.out.println(fourans);
    }
}
