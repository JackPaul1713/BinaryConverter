package binaryConverter;

import java.util.Scanner;

public class GetMessage
{

	public static String getMessage(int convDir)
	{
		
		//variables
		
		String message = "";
		Scanner strInput = new Scanner(System.in);
		
		//action
		
		if (convDir == 1)
		{
			
			System.out.println("Enter some text.");
			System.out.println("");
			
		}
		else if (convDir == 2)
		{
			
			System.out.println("Enter binary code.");
			System.out.println("");
			
		}
		
		message = strInput.nextLine();
		System.out.println("");
		
		//return
		
		return(message);
		
	}
	
}
