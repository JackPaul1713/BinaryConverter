package binaryConverter;

import java.util.Scanner;

public class GetConvDir
{

	public static int getConvDir()
	{
	
		//variables
		
		int responce;
		Scanner intInput = new Scanner(System.in);
		
		//action
		
		System.out.println("For text to binary (1)");
		System.out.println("For binary to text (2)");
		responce = intInput.nextInt();
		System.out.println("");
		
		//return
		
		return(responce);
		
	}
	
}
