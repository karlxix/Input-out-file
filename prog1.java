package output_file;
import java.io.*;
import java.util.*;
public class prog1 {
	static Scanner console  = new Scanner (System.in);
	public static void main(String[] args) throws Exception {


		int gender = 2, female=0, male=0, x;
		String names;
		
		FileWriter fwriter = new FileWriter ("output1.txt", true);
		PrintWriter outputFile = new PrintWriter(fwriter);
		Date date = new Date();
		String str = String.format("Transaction Date: %tc", date);
		outputFile.println(str);
		
		for (x=0; x<15; x++)
		{
			System.out.print("Enter Name " + (x+1) + ": ");
			outputFile.print("Enter Name " + (x+1) + ": ");
			
			names = console.next();
			outputFile.println(names);
			
			do
			{
			System.out.print("Enter Gender: ");
			outputFile.print("Enter Gender: ");
			gender = console.nextInt();
			outputFile.println(gender);
			
			if (gender == 0 )
				female = female + 1;
			else if (gender == 1)
				male = male + 1;
			else 
				System.out.println("Invalid Gender!");
			}	
			while(gender != 0 && gender != 1);
			
		}
		
		System.out.println();
		outputFile.println();
		System.out.println("Male: "+ male + "\t" + "Female: " + female);
		outputFile.println("Male: "+ male + "\t" + "Female: " + female);
		
		outputFile.close();
	}
	
}

