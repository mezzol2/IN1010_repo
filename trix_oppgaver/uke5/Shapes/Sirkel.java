class Sirkel implements Figur{
    private double radius;
    
    Sirkel(double radius){
        this.radius = radius;
    }

    @Override
    public double beregnAreal() {
        return Math.PI*radius*radius;
    }

    @Override
    public double beregnOmkrets() {
        return 2*Math.PI*radius;
    }
}