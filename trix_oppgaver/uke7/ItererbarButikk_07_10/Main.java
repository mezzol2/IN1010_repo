class Main{
    public static void main(String[] args) {
        Person person1 = new Person("John", "Advil");
        Person person2 = new Person("Sarah", "Morphine");
        Person person3 = new Person("Tom", "some real hard drugs");
        Person person4 = new Person("Zack", "a lollipop");
        Person person5 = new Person("Jane", "bottle of water");

        Butikk store = new Butikk();

        store.kassa();
        store.entreButikk(person1);
        store.entreButikk(person2);
        store.entreButikk(person3);
        store.entreButikk(person4);
        store.entreButikk(person5);

        for (Person p : store){
            System.out.println(p.getName());
        }

        store.kassa();
        store.kassa();
        store.kassa();
        store.kassa();
        store.kassa();
    }
}