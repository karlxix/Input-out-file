package output_file;
import java.io.*;
import java.util.*;
public class prog2 {
	static Scanner console  = new Scanner (System.in);
	public static void main(String[] args) throws Exception {

		int numbers[] = new int[5];
		int x, y, sum = 0, temp;
		
		FileWriter fwriter = new FileWriter ("output2.txt", true);
		PrintWriter outputFile = new PrintWriter(fwriter);
		Date date = new Date();
		String str = String.format("Transaction Date: %tc", date);
		outputFile.println(str);
		
		for (x=0; x<5; x++)
		{
			System.out.print("Enter Number " + (x+1) + ": ");
			outputFile.print("Enter Number " + (x+1) + ": ");
			
			numbers[x] = console.nextInt();
			outputFile.println(numbers[x]);
			
			sum = numbers[x] + sum;
		}
		
		System.out.println();
		outputFile.println();
		System.out.println("Displaying all Content");
		outputFile.println("Displaying all Content");
		
		for (x=0; x<5; x++)
		{	
			System.out.println(numbers[x]);
			outputFile.println(numbers[x]);
		}
		
		outputFile.println();
		System.out.println();
		System.out.println("The sum is: " + sum);
		outputFile.println("The sum is: " + sum);
		
		System.out.println();
		outputFile.println();
		
		System.out.println("Displaying ODD numbers");
		outputFile.println("Displaying ODD numbers");

		
		for (x=0; x<5; x=x+2)
		{
			System.out.println(numbers[x]);
			outputFile.println(numbers[x]);
		}
		
		outputFile.println();
		System.out.println();
		System.out.println("Displaying in Descending Order");
		outputFile.println("Displaying in Descending Order");
		
		for (x=0; x<5; x++)
		{
			for (y=x+1; y<5; y++)
			{
				if (numbers[x] < numbers[y])
				{
					temp = numbers[x];
					numbers[x] = numbers[y];
					numbers[y] = temp;
				}
			}
		}
		
		for (x=0; x<5; x++)
		{
			System.out.println(numbers[x]);
			outputFile.println(numbers[x]);
		}
		outputFile.close();

	}
	
}

