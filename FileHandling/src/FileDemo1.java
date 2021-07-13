import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	
	public static void main(String[] args) {
		
		File file = new File("d:/DHL/sample.txt");
		boolean result = false;
		try {
			result =file.createNewFile(); // if file is already created then it will not create any new file.
			// it will return false
			if(result) {
				System.out.println("file is created");
			}
			else {
				System.out.println("file alread exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
