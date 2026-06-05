package Files;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("C:\\Coforge\\xyz.txt") ;
			myWriter.write("Trainer is Friendly ! super Happy but no leraning! Enjoy.Project selection");
			System.out.println("Text is written in the file");
			myWriter.close();
		}catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		

	}

}
