import java.util.ArrayList;

class Student{
    private String name;
    private ArrayList<String> classes = new ArrayList<String>();

    public Student(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void printClasses(){
        for (String c : classes){
            System.out.println(c);
        }
    }

    public void addClass(String c){
        classes.add(c);
    }

    public void removeClass(String c){
        classes.remove(c);
    }

    public int getNumClasses(){
        return classes.size();
    }
}