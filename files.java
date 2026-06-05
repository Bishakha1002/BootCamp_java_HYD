package Files;

import java.io.File;
import java.io.IOException;

public class files {

	public static void main(String[] args) {
		try {
			File myObj = new File("C:\\Coforge\\xyz.txt");
			if(myObj.createNewFile()) {
				System.out.println("File Created:" + myObj.getName());
				System.out.println("Absolute Path:" + myObj.getAbsolutePath());
			}else {System.out.println("File already exists.");
			
				
			}
		}catch(IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		

	}

}
