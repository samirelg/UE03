package h3;

public class H3_main {
    public static void main(String[] args) {
        int max = 5;
        int fix = 2;
        int wartend = 1;
        boolean istVoll;
        
        while (fix < max && wartend > 0) {
            fix++;
            wartend--;
        }

        istVoll = (fix == max);

        System.out.println(max);
        System.out.println(fix);
        System.out.println(wartend);

        if (istVoll) {
            System.out.println("Status: PLATZ VOLL!");
            System.out.println("Alle " + fix + " Plätze sind belegt.");
            System.out.println("Es warten noch " + wartend + " Teilnehmer:innen.");
        } else {
            System.out.println("Status: PLATZ VORHANDEN.");
            System.out.println("Es sind " + fix + " von " + max + " Plätzen belegt.");
            System.out.println("Es warten noch " + wartend + " Teilnehmer:innen.");
        }
    }

}
