class Film {
    private String tittel;
    private String sjanger;
    private int antSett = 0;
    private static int totalAntSett = 0;

    Film (String tittel, String sjanger ){
        this.tittel = tittel;
        this.sjanger = sjanger;
    }

    public void seFilm(){
        antSett++;
        totalAntSett++;
    }

    public static int hentTotAnt(){
        return totalAntSett;
    }

}