package converter;

import java.nio.charset.StandardCharsets;

public class BinToText
{
	public static String binToText(String bins)
	{
		// var
		//bins = bins.replace(" ", "");
		String[] bin = bins.split("(?<=\\G.{8})");
		byte[] bites = new byte[bin.length];
		//getText
		for (int i = 0; i < bin.length; i++)
		{
			bites[i] = getByte(bin[i]);
		}
		//ret
		return(new String(bites, StandardCharsets.UTF_8));
	}
	//getStr
	public static byte getByte(String bin)
	{
		//var
		int bite = 0;
		String[] splitBin = bin.split("");
		//getBin
		for (int i = 7; i >= 0; i--)
		{
			if(splitBin[i].equals("1"))
			{
				bite = (int) (bite + 1 * Math.pow(2, 7-i));
			}
		}
		//ret
		return((byte) bite);
	}
}
