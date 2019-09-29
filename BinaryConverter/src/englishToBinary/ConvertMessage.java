package englishToBinary;

public class ConvertMessage
{
	
	public static String convertMessage(String[] refinedMessageArray)
	{
		
		//variables
		
		int refinedMessageArrayLength = refinedMessageArray.length;
		String translatedMessage = "";
		
		String[] upperCaseAlphabet = 
		{

			"A", "B", "C", "D", "E", 
			"F", "G", "H", "I", "J", 
			"K", "L", "M", "N", "O", 
			"P", "Q", "R", "S", "T", 
			"U", "V", "W", "X", "Y", 
			"Z"

		};

		String[] lowerCaseAlphabet = 
		{

			"a", "b", "c", "d", "e",
			"f", "g", "h", "i", "j",
			"k", "l", "m", "n", "o",
			"p", "q", "r", "s", "t",
			"u", "v", "w", "x", "y", 
			"z"

		};

		String[] numbers = 
		{

			"0", "1", "2",
			"3", "4", "5",
			"6", "7", "8", 
			"9"

		};

		String[] symbols = 
		{

			" ", "!", "\"", "#", 
			"$", "%", "&", "'", 
			"(", ")", "*", "+", 
			",", "-", ".", "/", 
			"?", "@"

		};

		String[] binaryUpperCaseAlphabet = 
		{

			"01000001", "01000010", "01000011", "01000100", "01000101",
			"01000110", "01000111", "01001000", "01001001", "01001010",
			"01001011", "01001100", "01001101", "01001110", "01001111",
			"01010000", "01010001", "01010010", "01010011", "01010100",
			"01010101", "01010110", "01010111", "01011000", "01011001", 
			"01011010"

		};

		String[] binaryLowerCaseAlphabet = 
		{

			"01100001", "01100010", "01100011", "01100100", "01100101",
			"01100110", "01100111", "01101000", "01101001", "01101010",
			"01101011", "01101100", "01101101", "01101110", "01101111",
			"01110000", "01110001", "01110010", "01110011", "01110100",
			"01110101", "01110110", "01110111", "01111000", "01111001", 
			"01111010"

		};

		String[] binaryNumbers = 
		{
				
			"00110000", "00110001", "00110010",
			"00110011", "00110100", "00110101",
			"00110110", "00110111", "00111000", 
			"00111001"

		};

		String[] binarySymbols = 
		{

			"00100000", "00100001", "00100010", "00100011", 
			"00100100", "00100101", "00100110", "00100111", 
			"00101000", "00101001", "00101010", "00101011", 
			"00101100", "00101101", "00101110", "00101111", 
			"00111111", "01000000" 

		};
		
		//action
		
		for (int rml = 0; rml < refinedMessageArrayLength; rml++)
		{
			
			for (int ul = 0; ul < upperCaseAlphabet.length; ul++)
			{
				
				if (refinedMessageArray[rml].equals(upperCaseAlphabet[ul]))
				{
				
					translatedMessage = translatedMessage + binaryUpperCaseAlphabet[ul];
					
				}
				
			}
			
			for (int ll = 0; ll < lowerCaseAlphabet.length; ll++)
			{
				

				if (refinedMessageArray[rml].equals(lowerCaseAlphabet[ll]))
				{
			
					translatedMessage = translatedMessage + binaryLowerCaseAlphabet[ll];
					
				}
				
			}
			
			for (int nl = 0; nl < numbers.length; nl++)
			{
				
				if (refinedMessageArray[rml].equals(numbers[nl]))
				{
				
					translatedMessage = translatedMessage + binaryNumbers[nl];
					
				}
				
			}
			
			for (int sl = 0; sl < symbols.length; sl++)
			{
				
				if (refinedMessageArray[rml].equals(symbols[sl]))
				{
				
					translatedMessage = translatedMessage + binarySymbols[sl];
					
				}
				
			}
			
		}
		
		//return
		
		return(translatedMessage);
		
	}

}
