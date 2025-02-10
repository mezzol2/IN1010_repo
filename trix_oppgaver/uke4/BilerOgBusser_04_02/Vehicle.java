abstract class Vehicle{
    protected String regNum;
    protected String brand;
    protected String owner;

    Vehicle(String regNum, String brand, String owner){
        this.regNum = regNum;
        this.brand = brand;
        this.owner = owner;
    }

    public abstract void printInfo();
    public abstract String getOwner();
    public abstract int getFee();
}