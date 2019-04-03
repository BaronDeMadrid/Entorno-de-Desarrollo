package ClaseFile;
import java.io.*;
public class ClaseFile {
File file ;
void printIfFileExists(String s_fileName)throws IOException{
	file = new File(s_fileName);
	System.out.println(file.exists());
}
void printIfFileOrDirectory(String s_fileName)throws IOException{
	file = new File(s_fileName);
	if(file.isDirectory()==true){
		System.out.println("is Directory");
	}else {
		System.out.println("is File");
	}
}
void printsFileAbsolutePath(String s_fileName)throws IOException{
	file = new File(s_fileName);
	System.out.println(file.getAbsolutePath());
}
void printsAllFilesWithinDirectory(String s_directory)throws IOException{
	file = new File(s_directory);
	File[] arr=file.listFiles();
	for(int i=0;arr.length>i;i++) 
	{
		System.out.println(arr[i]);
	}
}
void makesDirectory(String s_directory)throws IOException{
	file = new File(s_directory);
	file.mkdir();
}
}
