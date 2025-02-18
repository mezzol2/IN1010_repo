class Main{
    public static void main(String[] args){
        double r = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);
        double l = Double.parseDouble(args[2]);

        System.out.println("Cirle radius: "+r);
        Sirkel c = new Sirkel(r);
        System.out.println("Circle area: "+c.beregnAreal());
        System.out.println("Circle circumferance: "+c.beregnOmkrets());
        Rektangel rect = new Rektangel(h, l);
        System.out.println("Rectangle length and width: "+l+" "+h);
        System.out.println("Rectangle Area: "+rect.beregnAreal());
        System.out.println("Rectangle Perimeter: "+rect.beregnOmkrets());



    }
}