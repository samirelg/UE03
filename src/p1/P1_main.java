package p1;

public class P1_main {

    public static void main(String[] args) {
    int wuerfel = 4;

    if (wuerfel == 1 || wuerfel == 4) { // Bedingung 1
        System.out.println("Sie haben gewonnen!");
    }
    else if (wuerfel == 2) { // Bedingung 2
        System.out.println("Sie haben verloren!");
    }    
    else if (wuerfel == 5) { // Bedingung 3
        System.out.println("Es ist unentschieden!");
    }
    else if (wuerfel == 6) { // Bedingung 4
        System.out.println("Die Lage ist unklar!");
    }
    }
}
