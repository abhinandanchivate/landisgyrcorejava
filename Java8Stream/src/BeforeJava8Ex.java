import java.util.Arrays;
import java.util.List;

public class BeforeJava8Ex {
	 public static void main(String[] args) {

	        List<Person> persons = Arrays.asList(
	                new Person("abhi", 30),
	                new Person("abhinandan", 20),
	                new Person("advik", 40)
	        );

	    Person result = persons.stream().filter(e->"ABHI".equals(e.getName())).findAny()
	    		.orElse(null);
	    // stream :will transform list into stream 
	    // filter : predicate(filtering criteria).
	    // findany : will find the expected string
	    // orElse : if not found then return null.
	        System.out.println(result);

	    }

	    private static Person getStudentByName(List<Person> persons, String name) {

	        Person result = null;
	        for (Person temp : persons) {
	            if (name.equals(temp.getName())) {
	                result = temp;
	            }
	        }
	        return result;
	    }
}
