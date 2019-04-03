package ClaseFile;
import java.io.IOException;
public class Main {

	public static void main(String[] args)throws IOException {
		ClaseFile f = new ClaseFile();
		String s_fileName="";
		String s_directory="";
		f.printIfFileExists(s_fileName);
		f.makesDirectory(s_directory);
		f.printIfFileOrDirectory(s_fileName);
		f.printsFileAbsolutePath(s_fileName);
		
	}

}
