abstract class Ansatt extends Person{
    protected double hourlyRate;

    Ansatt(String name, int age, double hourlyRate){
        super(name, age);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }
}