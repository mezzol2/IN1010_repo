import java.util.ArrayList;

class Fag{
    private ArrayList<Student> studenter = new ArrayList<Student>();
    private String name;

    public Fag(String n){
        name = n;
    }

    public void addStudent(Student s){
        studenter.add(s);
        s.addClass(name);
    }

    public void removeStudent(Student s){
        studenter.remove(s);
        s.removeClass(name);
    }

    public String getName(){
        return name;
    }

    public void printStudents(){
        for (Student s: studenter){
            System.out.println(s.getName());
        }
    }

    public int getNumStudents(){
        return studenter.size();
    }

    public ArrayList<Student> getStudInClass(){
        return studenter;
    }
}