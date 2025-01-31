public class TestEspressoMaskin {
    public static void main(String[] args) {
        EspressoMaskin maskin = new EspressoMaskin();
        System.out.println();

        maskin.lagLungo();
        maskin.lagEspresso();
        System.out.println();

        maskin.fyllVann(100);
        System.out.println();

        maskin.lagEspresso();
        System.out.println();

        maskin.fyllVann(950);
        System.out.println();

        maskin.fyllVann(0);
        System.out.println();

        maskin.lagLungo();
        System.out.println();

        System.out.println(maskin.hentVannmengde());
    }
    
}
