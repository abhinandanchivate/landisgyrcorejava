import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WalkThroughADir {

	public static void main(String[] args) {
		// try with resource.
		List<Path> list;
		try (Stream<Path> walk = Files.walk(Paths.get("D:\\DHL\\Test"));

		) {
			walk.parallel()
			.filter(p -> !Files.isDirectory(p))
			.map(p -> p.toString().toLowerCase())
					.filter(f -> f.endsWith("txt"))
					.map(p -> Paths.get(p))
					//.collect(Collectors.toList())
					.forEach(e -> {
						try {
							System.out.println(Files.deleteIfExists(e));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					});

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
