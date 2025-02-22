class Trekant extends GeometriskFigur{
    private double height;
    private double width;

    public Trekant(double h, double w){
        height = h;
        width = w;
    }

    public double beregnAreal(){
        return width*height/2;
    }

}