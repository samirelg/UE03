package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 50;
        int b = 50;
        int c = 100;
        int d = 0;

        if (a == b) { // E1
            d++;
        }
        if (a == b || a == c) { // E2
            d++;
        }
        if (a+b >= c) { // E3
            d++;
        }

        if (a + b + c >= 100) { // E4
            d++;
        }
        System.out.println(d);
    }   
}
