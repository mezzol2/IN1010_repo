class Truck extends Vehicle{
    private int loadCap;

    Truck(String regNum, String brand, String owner, int loadCap){
        super(regNum, brand, owner);
        this.loadCap = loadCap;
    }

    public void printInfo(){
        System.out.print("Truck\nRegistration Number: "+regNum+"\nBrand: "+brand+"\nOwner: "+owner+"\nLoad Capacity: "+ loadCap);
        System.out.println();
        System.out.println("Annual fee: "+loadCap*4);
    }

    public String getOwner(){
        return owner;
    }

    public int getFee(){
        return loadCap*4;
    }
}