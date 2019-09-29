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
			
		}
		else if (convDir == 2)
		{
			
			System.out.println("Enter binary code.");
			
		}
		
		message = strInput.nextLine();
		System.out.println("");
		
		//return
		
		return(message);
		
	}
	
}
