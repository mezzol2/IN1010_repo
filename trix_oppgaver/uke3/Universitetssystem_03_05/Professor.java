class Professor extends Ansatt{
    private String fagområde;
    private String course;

    Professor(String name, int age, double hourlyRate, String fagområde, String course){
        super(name, age, hourlyRate);
        this.fagområde = fagområde;
        this.course = course;
    }

    public void printInfo(){
        System.out.println(name+" is a "+age+" year old Professor who teaches "+course+" and studies " +fagområde+" for "+hourlyRate+" per hour." );
    }
}
