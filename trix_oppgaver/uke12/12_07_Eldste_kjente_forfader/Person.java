class Person implements Comparable<Person>{
    private String name;
    private int birthYear;
    private Person mother;
    private Person father;

    Person(int birthYear,String name, Person mother, Person father){
        this.name = name;
        this.birthYear = birthYear;
        this.mother = mother;
        this.father = father;
    }

    public int getBirthYear(){
        return birthYear;
    }

    @Override
    public String toString(){
        return name;
        //+ " "+ birthYear + " " + father + " " + mother;
    }

    @Override
    public int compareTo(Person otherPerson){
        //if this.person is born earlier, return negative
        //if this.person is born later, return positive
        return Integer.compare(birthYear, otherPerson.getBirthYear());        
    }

    public Person finnEldsteKjenteForfader(){
        //if no parents, return this person
        if (this.mother == null && this.father == null){
            return this;
        }


        //Check paternal line
        Person oldestPaternal = null;
        if (father != null){
            oldestPaternal = father.finnEldsteKjenteForfader();
            if (mother == null){
                return oldestPaternal;
            }
        }

        //Check maternal line
        Person oldestMaternal = null;
        if (mother != null){
            oldestMaternal = mother.finnEldsteKjenteForfader();
            if (father == null){
                return oldestMaternal;
            }
        }

        //Return the oldest between the paternal and maternal lines
        if (oldestPaternal.compareTo(oldestMaternal) <= 0){
            return oldestPaternal;
        }
        return oldestMaternal;
        
    }
}
