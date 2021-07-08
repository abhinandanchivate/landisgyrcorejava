import java.util.Arrays;
import java.util.List;

public class Stream3 {

	public static void main(String[] args) {
		
		  List<Person> persons = Arrays.asList(
	                new Person("abhi", 30),
	                new Person("abhinandan", 20),
	                new Person("advik", 40)
	        );
		  
		  System.out.println(persons.stream().map(Person::getName).toList());
		  
		 List<PersonDetails> list =  persons.stream().map(o->{
			  PersonDetails details = new PersonDetails();
			  details.setAge(o.getAge());
			  details.setName(o.getName());
			  details.setLocation("Noida");
			  return details;
		  }).toList();
		 
		 list.forEach(System.out::println);
	}
	
}


// you have to transform the Person object to Person details (name, id, age, location{Noida})