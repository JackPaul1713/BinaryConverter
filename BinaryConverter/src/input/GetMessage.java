package input;

import java.util.Scanner;

public class GetMessage
{
	public static String getMessage(int convDir)
	{
		//var
		String message = "";
		Scanner strInput = new Scanner(System.in);
		//act
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
		//ret
		return(message);
	}
}
