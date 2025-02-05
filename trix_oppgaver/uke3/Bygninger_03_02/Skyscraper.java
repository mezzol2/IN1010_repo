class Skyscraper extends Bygning{
    
    protected int antEtasjer;
    
    public Skyscraper(double areal, int etasjer){
        // Super() must be the first thing called if used!!
        super(areal);
        System.out.println("I am a skyscraper.");
        antEtasjer = etasjer;
    }
}