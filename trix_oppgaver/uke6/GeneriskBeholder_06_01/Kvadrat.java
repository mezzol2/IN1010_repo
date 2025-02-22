class Kvadrat extends GeometriskFigur{
    private double side;

    public Kvadrat(double s){
        side = s;
    }

    public double beregnAreal(){
        return side*side;
    }
}