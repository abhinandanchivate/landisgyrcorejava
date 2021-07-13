import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyAndMoveEx {

	public static void main(String[] args) {
		
		String src = "d:\\DHL\\Test\\Sample.txt";
		String dest = "d:\\DHL\\Test\\Sample2.txt";
		
		if(Files.notExists(Paths.get(src))) {
			System.out.println("file doesnot exists");
			
		}
		try {
			Files.copy(Paths.get(src), Paths.get(dest));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
