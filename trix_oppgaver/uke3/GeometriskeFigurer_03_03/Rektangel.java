class Rektangel extends GeometriskFigur{
    private double height;
    private double width;

    public Rektangel(double h, double w){
        height = h;
        width = w;  
    }
    
    public double beregnAreal(){
        return height*width;
    }
}