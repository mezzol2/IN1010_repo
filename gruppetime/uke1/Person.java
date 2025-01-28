class Person{
    private int alder;
    private String navn;

    Person(int a, String n){
        alder = a;
        navn = n;
    }

    public void skrivUt(){
        System.out.println(navn+alder);
    }

    public void burskdag(){
        alder++;
    }
}