class Motorsykkel{
    private int kilometerstand = 0;
    private String registreringsnummer;
    private int produksjonsnummer;
    private static int teller;

    Motorsykkel( String r){
        registreringsnummer = r;
        produksjonsnummer = teller;
        teller++;
    }

    public int hentKilometerstand(){
        return kilometerstand;
    }

    public int hentProduksjonsnummer(){
        return produksjonsnummer;
    }

    public void kjoer(int antallKilometer){
        kilometerstand += antallKilometer;
    }
}