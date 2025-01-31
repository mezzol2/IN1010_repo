import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

class Studentsystem{
    private HashMap<String,Fag> fagList = new HashMap<String,Fag>();
    private HashMap<String, Student> studenter = new HashMap<String,Student>();

    public Studentsystem(String fileName){
        try{
            Scanner file = new Scanner(new File(fileName));
            Fag sistFag = null;

            while (file.hasNextLine()){
                String line = file.nextLine();
                line = line.trim();

                if (line.charAt(0) == '*'){
                    line = line.substring(1);
                    Fag fag = new Fag(line);
                    fagList.put(line,fag);
                    sistFag = fag;
                } else if (studenter.containsKey(line)){
                    sistFag.addStudent(studenter.get(line)); 
                }else{
                    Student student = new Student(line);
                    studenter.put(line, student);
                    if (sistFag != null){sistFag.addStudent(student);}
                }
            }
            file.close();

        } catch (Exception e){
            System.out.println("File "+fileName+" not found.");
            System.exit(1);
        }
    }

    public void printStudents(){
        for (String s: studenter.keySet()){
            System.out.println(s);
        }
    }

    public void studentWithMostClasses(){
        int numClasses;
        int mostClasses =0;
        String studName="test";
        
        for (Student s : studenter.values()){
            numClasses = s.getNumClasses();
            if (numClasses > mostClasses){
                studName = s.getName();
                mostClasses = numClasses;
            }
        }
        System.out.println(studName+" is taking " +mostClasses+" classes!");
    }

    public void mostPopularClass(){
        int numStudents;
        int mostStudents = 0;
        String mostPopularClass = "test";

        for (Fag f : fagList.values()){
            numStudents = f.getNumStudents();
            if (numStudents > mostStudents){
                mostStudents = numStudents;
                mostPopularClass = f.getName();
            }
        }

        System.out.println(mostPopularClass+" has the most students with "+mostStudents+" enrolled.");
    }

    public void printStudentsIn(String className){
        for (Fag f : fagList.values()){
            if (f.getName().equals(className)){
                System.out.println("Class "+className+" has the following students:");
                f.printStudents();
            }
        }
    }

    public void printStudentsClasses(String name){
        if (studenter.containsKey(name)){
            Student s = studenter.get(name);
            System.out.println(name+" is in these classes:");
            s.printClasses();
        }
    }

    public void newStudent(String name){
        Student student = new Student(name);
        studenter.put(name, student);
    }

    public void newFag(String name){
        Fag f = new Fag(name);
        fagList.put(name, f);
    }

    public void putStudInFag(String stud,String fag){
        //if (fagList.containsKey(fag) && studenter.containsKey(stud)){
            fagList.get(fag).addStudent(studenter.get(stud));
        //}
    }

    public void removeStudFromFag(String stud,String fag){
        if (fagList.containsKey(fag) && studenter.containsKey(stud)){
            fagList.get(fag).removeStudent(studenter.get(stud));
        }
    }

    public void printCourseList(){
        for (Fag f : fagList.values()){
            System.out.println(f.getName());
        }
    }

    public void newFile(String newFileName){
        PrintWriter newFile = null;

        try {
            newFile = new PrintWriter(newFileName);
        }catch (Exception e){
                System.out.println("There was a error.");
                System.exit(1);
            }

        for (Fag f : fagList.values()){
            newFile.println('*'+f.getName());
            ArrayList<Student> studList = f.getStudInClass();
            for (Student s : studList){
                newFile.println(s.getName());
            }
        }

        newFile.close();
    }
    

}