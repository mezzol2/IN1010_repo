class Sirkel extends GeometriskFigur{
    private double radius;

    public Sirkel (double r){
        radius = r;
    }

    public double beregnAreal(){ 
        return Math.PI*(radius*radius);
    }

    @Override
    public String toString(){
        return "I am a circle";
    }
}