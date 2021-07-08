import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream1 {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "java","node","express","react",
				"spring", "java","node","express","react","spring", "java","node");
		System.out.println(getFilteredOutput(lines, "spring"));
	}
	
	public static List<String> getFilteredOutput(List<String> list, String filter) {
		List<String> resultList = new ArrayList<>();
	
		
		return list.stream().filter(e->filter.equals(e)).toList();
	}
}
