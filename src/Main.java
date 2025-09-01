public class Main {
    public static void main(String[] args) {
        Hund meinHund = new Hund();
        meinHund.essen(); // Erbt die Methode von Tier
        meinHund.bellen(); // Eigene Methode von Hund
    }
}