public class BoolskeVerdier {
    public static void main(String[] args) {
        boolean sann = true; boolean usann = false;
        System.out.println(sann);

        if (sann != usann) {
            System.out.println("Første test slo til!");
        }

        if (sann == usann) {
            System.out.println("Noe gikk feil!");
        }
        else {
            System.out.println("Andre test slo ikke til!");
        }
    }
}