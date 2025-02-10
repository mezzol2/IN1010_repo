class Buss extends Vehicle{
    private int capacity;

    Buss(String regNum, String brand, String owner, int capacity){
        super(regNum, brand, owner);
        this.capacity = capacity;
    }

    public void printInfo() {
        
        System.out.print("Buss\nRegistration Number: "+regNum+"\nBrand: "+brand+"\nOwner: "+owner+"\nCapacity: "+ capacity);
        System.out.println();
    }  
    
    public String getOwner(){
        return owner;
    }

    public int getFee(){
        return 0;
    }
}
