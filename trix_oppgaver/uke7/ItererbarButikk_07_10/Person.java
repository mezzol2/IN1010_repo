class Person{
    private String name;
    private String item;
    private Person nextPerson = null;

    Person(String name, String item){
        this.name = name;
        this.item = item;
    }

    public void setNextPerson(Person person){
        nextPerson = person;
    }

    public String getName(){
        return name;
    }

    public String getItem(){
        return item;
    }

    public Person getNextPerson(){
        return nextPerson;
    }

    @Override
    public String toString(){
        String string = "Name: "+name+"\nItem: "+item+"\nNext Person: ";
        if (nextPerson != null){
            string +=nextPerson.getName();
            return string;
        } else{
            string += "None";
            return string;
        }
    }
}