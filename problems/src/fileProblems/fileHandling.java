package fileProblems;
import java.util.*;
import java.io.*;
public class fileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String oldContent = "";
		String newContent = sc.nextLine();
		
		File file = new File("E:\\Gokulesh\\fileHandling.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String temp = br.readLine();
		
		while(temp != null)
		{
			oldContent += temp;
			temp = br.readLine();
		}
		
		FileWriter fw = new FileWriter("E:\\\\Gokulesh\\\\fileHandling.txt");
		fw.write(oldContent+newContent);
		fw.close();
		br.close();

	}   
	

}
