import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileIO {
	public static String getFile(String path) {
		File f = new File(path); 
		try {
			Scanner s = new Scanner(f);
			StringBuilder content = new StringBuilder();
			
			while (s.hasNextLine()) {
				content.append(s.nextLine()); 
				content.append("\r\n");
			}
			return content.toString();
			
		} catch (FileNotFoundException e) {
			return "";
		}
	
	
	}
}
