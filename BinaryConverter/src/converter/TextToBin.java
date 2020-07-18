package converter;

import java.nio.charset.StandardCharsets;

public class TextToBin
{
	public static String textToBin(String text)
	{
		//var
		byte[] bites = text.getBytes(StandardCharsets.UTF_8);
		String bin = "";
		//getBin
		for(int i = 0; i < bites.length; i++)
		{
			bin = bin + getBin(bites[i]);
		}
		return(bin);
	}
	//res
	public static String getBin(int val)
	{
		//var
		String bin = "";
		int[] splitBin = new int[8];
		//getBin
		while (val > 0)
		{
			for (int i = 7; i >= 0; i--)
			{
				if (splitBin[i] < 1)
				{
					splitBin[i]++;
					break;
				} else
				{
					splitBin[i]--;
				}
			}
			val--;
		}
		//makeStr
		for (int i = 0; i < 8; i++)
		{
			bin = bin + "" + splitBin[i];
		}
		//ret
		return(bin);
	}
}
