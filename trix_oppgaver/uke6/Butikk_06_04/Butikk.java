import java.util.ArrayList;

class Butikk{
    private Person firstPerson=null;
    private Person lastPerson = null;
    private ArrayList<Person> queue = new ArrayList<>();

    public void entreButikk(Person person){
        if (firstPerson == null){
            firstPerson = person;
        }
        if (lastPerson != null){
            lastPerson.setNextPerson(person);
        }
        lastPerson = person;
        queue.add(person);
    }

    public void kassa(){
        if (firstPerson == null){
            System.out.println("There are no customers in the store");
        } else{
            System.out.println(firstPerson.getName()+" buys "+firstPerson.getItem());
            firstPerson = firstPerson.getNextPerson();
            queue.remove(0);
        }
    }
}