class Rektangel {

    double lengde;
    double bredde;

    public Rektangel (double l, double b) {   // Konstruktør
    lengde = l; bredde = b;
    }
  
    public void oekLengde (int okning) {    // Oek lengden som angitt
        lengde += okning;
    }
  
    public void oekBredde (int okning) {    // Oek bredden som angitt
        bredde += okning;
    }
  
    public double areal () {     // Beregn mitt areal
        return lengde * bredde;
    }
  
    public double omkrets () {   // Beregn min omkrets
        return 2 * (lengde + bredde);
    }

    public void reduserBredde (int decrease) {
        if (bredde - decrease < 0) {
            System.out.println("Bredden kan ikke reduseres.");
        }
        else {
            bredde -= decrease;
        }
    }

    public void reduserLengde (int decrease) {
        if (lengde - decrease < 0) {
            System.out.println("Lengden kan ikke reduseres");
        }
        else {
            lengde -= decrease;
        }
    }
}

class RektangelMain{
    public static void main(String[] args) {
        Rektangel en = new Rektangel(3, 4);
        Rektangel to = new Rektangel(4, 5);

        System.out.println("Areal: " + en.areal());
        System.out.println("Areal: " + to.areal());

        en.oekLengde(1);
        to.oekBredde(1);
        
        System.out.println("Ens omkrets: " + en.omkrets());
        System.out.println("Tos omkrets: " + to.omkrets());     
    }
}