import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) throws IOException {
		
		//String s = "hello from abhi";
		
		try (
			BufferedInputStream iStream = new BufferedInputStream( new FileInputStream("d:\\DHL\\Test\\abc.txt"));
				BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("d:\\DHL\\Test\\abc4.txt",true));
			
		){
			int value = 0;
			while((value=iStream.read())!=-1) {
				System.out.println(value);
				bufferedOutputStream.write(value);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	bufferedOutputStream.close();
		
		
		
		
				
	}
}

class Sample2{
	public static void main(String[] args) {
		try (
				BufferedWriter writer = new BufferedWriter( new FileWriter("d:\\DHL\\Test\\abc2.txt"));
				
			){
				String s ="hello from writer";
				writer.append(s);
				writer.newLine();
				writer.append(s);
				writer.newLine();
				writer.append(s);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
