class EspressoMaskin {
    private int water;
    private static final int MAXWATER = 1000;

    public EspressoMaskin(){
        water = 0;
    }

    // Lag espresso dersom det er nok vann
    public void lagEspresso() {
        if (water >= 40){
            water -= 40;
            System.out.println("You made an espresso.");
            System.out.println("There is now "+water+" ml water in the machine.");

        } else {
            System.out.println("There is not enough water to make an espresso.");
            System.out.println("There is only "+water+" ml of water in the machine.");
        }
    }

    // Lag lungo dersom det er nok vann
    public void lagLungo() {
        if (water >= 110){
            water -= 110;
            System.out.println("You made a lungo.");
            System.out.println("There is now "+water+" ml water in the machine.");

        } else {
            System.out.println("There is not enough water to make an espresso.");
            System.out.println("There is only "+water+" ml of water in the machine.");
        }
    }

    // Fyll på et gitt antall milliliter vann, dersom det er plass
    public void fyllVann(int ml) {
        if (water == MAXWATER){
            System.out.println("The machine is already full");
        } else if (ml+water >=MAXWATER){
            int waterFill = MAXWATER-water;
            water = MAXWATER;
            System.out.println("The machine is now full.");
            System.out.println(waterFill+" ml of water was added to the machine.");
        } else {
            water += ml;
            System.out.println(ml+" ml of water was added to the machine.");
            System.out.println("There is now "+water+" ml of water in the machine.");
        }
    }

    // Les av målestrekene på vanntanken og tilgjengelig vann i ml
    public int hentVannmengde() {
        return water;
    }
}