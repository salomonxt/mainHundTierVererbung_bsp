public class Main {
    public static void main(String[] args) {
        Hund meinHund = new Hund();
        meinHund.essen(); // Erbt die Methode von Tier
        meinHund.bellen(); // Eigene Methode von Hund

        // Main.java

              // Hund meinHund = new Hund();

                // Aufruf der Methoden und Kombination der Ergebnisse
                String aktion = meinHund.essen() + " " + meinHund.bellen();

                System.out.println(aktion);
            }
        }


