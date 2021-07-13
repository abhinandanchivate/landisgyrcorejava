import java.io.File;

public class FilePermissionDmeo {

	public static void main(String[] args) {
		File file = new File("d:/DHL/sample.txt");
		
		System.out.println(file);
		//file.setExecutable(false);
		//file.setReadable(true);
		file.setReadOnly();
	//	file.setWritable(true);
		System.out.println(file.canRead());  // file is readable or not
		System.out.println(file.canWrite()); // file is writable or not
		System.out.println(file.canExecute()); // file is exectuable or not
	}
}
