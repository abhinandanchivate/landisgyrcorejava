import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate2 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Predicate<Integer> predicate = x->x>=5;
		Predicate<Integer>predicate2 = x->x<=10;
		List<Integer> collect = list.stream().filter(predicate.or(predicate2)).collect(Collectors.toList());
				//list.stream().filter(x->x>=5&& x<=10).collect(Collectors.toList());
		// true or false
		collect.forEach(System.out::println);
	}
}
