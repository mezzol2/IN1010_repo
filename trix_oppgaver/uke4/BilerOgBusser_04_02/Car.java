class Car extends Vehicle{
    private int seats;
    private final int ÅRSAVGIFT = 3000;

    Car(String regNum, String brand, String owner, int seats){
        super(regNum, brand, owner);
        this.seats = seats;
    }

    public void printInfo() {
        
        System.out.print("Car\nRegistration Number: "+regNum+"\nBrand: "+brand+"\nOwner: "+owner+"\nNumber of Seats: "+ seats);
        System.out.println();
        System.out.println("Annual fee: "+ÅRSAVGIFT);
    } 

    public int getFee(){
        return ÅRSAVGIFT;
    }

    public String getOwner(){
        return owner;
    }
}