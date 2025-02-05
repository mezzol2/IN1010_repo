abstract class Student extends Person {
    protected String course;
    protected String location;

    Student(String name, int age, String course, String location){
        super(name, age);
        this.course = course;
        this.location = location;
    }

    public abstract boolean hasAccess();
}
