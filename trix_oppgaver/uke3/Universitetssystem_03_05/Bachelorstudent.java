class Bachelorstudent extends Student {

    Bachelorstudent(String name, int age, String course, String location){
        super(name, age, course, location);
    }

    public boolean hasAccess(){
        return false;
    }

    public void printInfo(){
        System.out.println(name+" is a "+age+" year old Bachelors student at "+location+" taking "+course+".");
    }
}