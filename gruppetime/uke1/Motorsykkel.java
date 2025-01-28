class Motorsykkel{
    private int kilometerstand;
    private String registreringsnummer;
    private int produksjonsnummer;
    private static int teller;

    Motorsykkel( String r){
        kilometerstand = 0;
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

    public String hentRegistreringsnummer(){
        return registreringsnummer;
    }

    public void kjoer(int antallKilometer){
        kilometerstand += antallKilometer;
    }
}