import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyEX {

	public static void main(String[] args) {
		Path sourcePath      = Paths.get("C:\\Users\\mruser\\Desktop\\Java Eve Batch\\hello");
		Path destinationPath = Paths.get("C:\\Users\\mruser\\Desktop\\Java Eve Batch\\NewHello\\hello");

		try {
		    Files.copy(sourcePath, destinationPath);
		    System.out.println("done");
		} catch(FileAlreadyExistsException e) {
		    //destination file already exists
		} catch (IOException e) {
		    //something else went wrong
		    e.printStackTrace();
		}

	}

}
