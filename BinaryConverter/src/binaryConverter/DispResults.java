package binaryConverter;

public class DispResults
{

	public static void dispResults(int convDir, String translatedMessage)
	{
		
		if (convDir == 1)
		{
			
			System.out.println("Your message in binary code is:");
			System.out.println(translatedMessage);
			
		}
		else if (convDir == 2)
		{
			
			System.out.println("Your message in english is:");
			System.out.println(translatedMessage);
			System.out.println("");
			
		}
		
	}
	
}
