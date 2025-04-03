class Test {
    public static void main(String[] args) {
        Beholder beholder = new Beholder();
        beholder.add("q");
        beholder.add("w");
        beholder.add("e");
        beholder.add("r");
        beholder.add("t");
        beholder.add("y");

        // System.out.println(beholder.first);
        // System.out.println(beholder.last);

        for (String data : beholder){
            System.out.println(data);
        }
    }    
}
