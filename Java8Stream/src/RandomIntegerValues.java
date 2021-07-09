import java.util.Random;

public class RandomIntegerValues {

	// 1. java.util.Random.nextInt
	// 2. Math.random
	// 3. java.util.Random.ints(java8)
	
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(Integer.valueOf("-"+random.nextInt(100)));
		System.out.println(random.nextInt());
		System.out.println(Math.random());
		
		random.ints(10, 20, 40).forEach(System.out::println);
	}
}
