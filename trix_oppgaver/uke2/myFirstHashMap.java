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

        System.out.println(myHashMap.get(5));
        myHashMap.put(3, "new c!");
        System.out.println("New 3 value: "+myHashMap.get(3));

        myHashMap.remove(1);
        System.out.println(myHashMap.get(1));
        myHashMap.remove(1);
        System.out.println(myHashMap.get(1));

        for (String s: myHashMap.values()){
            System.out.println(s);}
        System.out.println();
        System.out.println(myHashMap);
        System.out.println(myHashMap.entrySet());

        for (HashMap.Entry<Integer, String> entry : myHashMap.entrySet()){
            System.out.println(entry.getKey());
        }

        for (HashMap.Entry<Integer, String> entry: myHashMap.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}