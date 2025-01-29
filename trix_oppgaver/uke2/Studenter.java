import java.util.HashMap;

class Studenter{

    private HashMap<String, Integer> studenter = new HashMap<>();
    
    Studenter(){
        studenter.put("Espen Askeladd", 1);
        studenter.put("john", 2);
        studenter.put("Fred", 3);
    }

    public boolean finnStudent(String navn){
        return studenter.containsKey(navn);
    }

    public void printStudentKeys(){
        for (String navn: studenter.keySet()){
            System.out.println(navn);
        }
    }

    public void printStudentValues(){
        for (int v : studenter.values()){
            System.out.println(v);
        }
    }
}