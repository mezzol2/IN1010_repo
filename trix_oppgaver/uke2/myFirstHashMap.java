import java.util.HashMap;

class myFirstHashMap{
    public static void main(String[] args) {
        HashMap<Integer,String> myHashMap = new HashMap<Integer,String>();
        myHashMap.put(1, "a");
        myHashMap.put(2, "b");
        myHashMap.put(3, "c");
        myHashMap.put(4, "d");
        myHashMap.put(5, "e");

        for (int i : myHashMap.keySet()) {
            System.out.println(i + ":" + myHashMap.get(i));
        }
    }
}