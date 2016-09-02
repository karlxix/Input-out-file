package output_file;
import java.io.*;
import java.util.*;
public class write {
	static Scanner console  = new Scanner (System.in);
	public static void main(String[] args) throws Exception {

		
		String name[] = new String[5];
		int x;
		FileWriter fwriter = new FileWriter ("output.txt", true);
		PrintWriter outputFile = new PrintWriter(fwriter);
		Date date = new Date();
		String str = String.format("Transaction Date: %tc", date);
		outputFile.println(str);
		
		for (x=0; x<=4; x++)
		{
			System.out.println("Enter Name " + (x+1) + ":");
			outputFile.println("Enter Name " + (x+1) + ":");
			name[x] = console.next();
			outputFile.println(name[x]);
		}
		outputFile.close();

	}
	
}

