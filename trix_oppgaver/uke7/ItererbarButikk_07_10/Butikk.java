import java.util.Iterator;
import java.util.ArrayList;

class Butikk implements Iterable<Person>{
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

    @Override
    public Iterator<Person> iterator(){
        return new PersonIterator();
    }

    private class PersonIterator implements Iterator<Person>{
    
        Person person = firstPerson;

        @Override
        public boolean hasNext(){
            return person != null;
        }

        @Override
        public Person next(){
            Person currentPerson = person;
            person = person.getNextPerson();
            return currentPerson;
        }
    }
}