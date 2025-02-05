class Masterstudent extends Student {
    Masterstudent(String name, int age, String course, String location){
        super(name, age, course, location);
    }

    public boolean hasAccess(){
        return true;
    }

    public void printInfo() {
        System.out.println(name+" is a "+age+" year old Masters student at "+location+" taking "+course+".");
    }
}
