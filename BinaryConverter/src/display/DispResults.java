package display;

public class DispResults
{
	public static void dispResults(int convDir, String translatedMessage)
	{
		//disp
		if (convDir == 1)
		{
			System.out.println("Your input in binary is:");
		}
		else if (convDir == 2)
		{
			System.out.println("Your input in text is:");
		}
		System.out.println(translatedMessage);
		System.out.println("");
	}
}
