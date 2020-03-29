package tool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tool {
	
	public static List<String> extractDict(){
		
		List<String> dict = new ArrayList<String>();
		
		File f = new File("src/dictionnaire.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String st ="";
			while((st = br.readLine()) != null) {
				dict.add(st);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return dict;
	}

}
