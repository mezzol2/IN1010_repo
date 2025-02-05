class Main{
    public static void main(String[] args) {
        double totalArea=0;
        
        Rektangel r = new Rektangel(7, 3);
        totalArea += r.beregnAreal();
        System.out.println("Rectangel area: "+ r.beregnAreal());

        Trekant t = new Trekant(2, 3);
        totalArea += t.beregnAreal();
        System.out.println("Triangle area: "+t.beregnAreal());

        Sirkel c = new Sirkel(3);
        totalArea += c.beregnAreal();
        System.out.println("Circle area: "+c.beregnAreal());

        Kvadrat k = new Kvadrat(4);
        totalArea += k.beregnAreal();
        System.out.println("Square area: "+k.beregnAreal());

        System.out.println("Total area: "+totalArea);
    }
}