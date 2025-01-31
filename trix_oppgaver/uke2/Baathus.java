class Baathus{
    private Baat[] baatArray;
    private int antallPlasser;

    public Baathus(int a){
        antallPlasser = a;
        baatArray = new Baat[a];  
    }

    public void settInn(Baat b){
        int i = 0;
        boolean sattInn = false;

        while (i < antallPlasser && !sattInn){
            if (baatArray[i] == null){
                baatArray[i] = b;
                sattInn = true;
                System.out.println("The boat was put in spot "+i);
            } else {
                i++;
            }
        }
        if (sattInn == false){
            System.out.println("There is no space in the boat house.");
        }
    }

    public void skrivBaater(){
        for (Baat b : baatArray){
            if (b != null){
                System.out.println(b.hentInfo());
            }
        }
    }
}