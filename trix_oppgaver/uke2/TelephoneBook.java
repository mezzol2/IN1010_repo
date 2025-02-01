//import java.util.ArrayList;
import java.util.HashMap;

class TelephoneBook{
	public static void main(String[] args){
		//a
		Person1 person1 = new Person1("John", "1111", "1 First St.");
		Person1 person2 = new Person1("Bob", "2222", "2 Second St.");
		Person1 person3 = new Person1("Sarah", "3333", "3 Third St.");
		
		//b
		// Person1[] personArray = new Person1[10];
		// personArray[0] = person1;
		// personArray[1] = person2;
		// personArray[2] = person3;

		// for (int i=0; i<10;i++){
		// 	if (personArray[i]!=null){
		// 		personArray[i].skrivInfo();
		// 	}
		// }

		//c
		// ArrayList<Person1> personer = new ArrayList<Person1>();
		// personer.add(person1);
		// personer.add(person2);
		// personer.add(person3);

		// for (Person1 p: personer){
		// 	p.skrivInfo();
		// }

		//d
		HashMap<String,Person1> personerHM = new HashMap<String,Person1>();
		personerHM.put(person1.hentNavn(), person1);
		personerHM.put(person2.hentNavn(), person2);
		personerHM.put(person3.hentNavn(), person3);

		for (Person1 p : personerHM.values()){
			p.skrivInfo();
		}
	}
}
