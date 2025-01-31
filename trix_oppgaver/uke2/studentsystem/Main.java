import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Studentsystem ss = new Studentsystem("emnestudenter.txt");
        ss.printStudents();
        ss.studentWithMostClasses();
        ss.mostPopularClass();
        System.out.println();

        ss.printStudentsIn("MAT1001");
        System.out.println();

        ss.printStudentsClasses("Ole Petter");
        System.out.println();

        Scanner user = new Scanner(System.in);

        System.out.println("Add a new student");
        String student = user.nextLine();
        ss.newStudent(student);
        ss.printStudents();
        System.out.println("Add a course");
        String fag = user.nextLine();
        ss.newFag(fag);
        ss.printCourseList();
        
        ss.putStudInFag(student, fag);
        
        ss.removeStudFromFag("Emilie", "INF1500");
        System.out.println("Enter a new file name");
        String newFileName = user.nextLine();
        user.close();

        ss.newFile(newFileName);        


    }   
}