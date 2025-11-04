package p3;

public class P3_main {
    public static void main(String[] args) {
        int i = -4;
        int b_i;

        if (i < 0) {
            b_i = i * -1; // Betrag sicherstellen
            System.out.println(b_i); // Aufgabe 1
        }
        
        System.out.println(i*i); // Aufgabe 2
        
        if (i%2 == 0) { // Aufgabe 3
            System.out.println("Die Zahl " + i + " ist gerade.");
        }
        else{
            System.out.println("Die Zahl " + i + " ist ungerade.");
            }
    }
}