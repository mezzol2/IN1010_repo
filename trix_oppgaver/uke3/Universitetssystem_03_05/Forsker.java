class Forsker extends Ansatt {
    private String fagområde;

    Forsker(String name, int age, double hourlyRate, String fagområde){
        super(name, age, hourlyRate);
        this.fagområde = fagområde;
    }

    public void printInfo(){
        System.out.println(name+" is a "+age+" year old Researcher who studies " +fagområde+" for "+hourlyRate+" per hour." );
    }
}
