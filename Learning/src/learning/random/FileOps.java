package learning.random;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			FileWriter f = new FileWriter(new File("K:\\test.txt"));
			f.write("TEXT");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
