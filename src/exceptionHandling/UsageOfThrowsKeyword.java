package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class UsageOfThrowsKeyword {

	public static void main(String[] args) {
		try {
			findFile();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	public static void findFile() throws IOException{
		
		//code that might throw an exception
		File newFile=new File("file.txt");
		FileInputStream stream=new FileInputStream(newFile);
	}

}
