class ArrayEksempler {
    public static void main(String[] args) {
        
        int[] tallListe = new int[4];
        
        for (int i = 0; i < tallListe.length; i++){

            tallListe[i] = i;
        }

        for (int i = 0; i < tallListe.length;i++){
            System.out.println(tallListe[i]);
        }

        //for each loop
        //for each element in tallListe, do something
        for (int element:tallListe){
            System.out.println(element);
        }

        String[] matListe = {"Melk", "Egg", "Pizza"};

        for (String element : matListe){
            System.out.println(element);
        }

        int antRad = 3;
        int antKol = 3;
        int[][] nostet = new int[antRad][antKol];
        int teller = 1;

        for (int i = 0; i < antRad; i++){
            for (int j = 0; j< antKol; j++){
                nostet[i][j] = teller;
                teller++;
            }
        }

        for (int i = 0; i < antRad; i++){
            for (int j = 0; j< antKol; j++){
                System.out.print(nostet[i][j]);
            }
            System.out.println();
        }

        Film film1 = new Film("Tenet", "acrion");
        film1.seFilm();
        int totaltSett = Film.hentTotAnt();
        System.out.println(totaltSett);

    }
}