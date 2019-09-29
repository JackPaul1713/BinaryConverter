package englishToBinary;

public class RefinedMessageToArray
{

	public static String[] refinedMessageToArray(String refinedMessage)
	{
		
		//variables
		
		String[] refinedMessageArray;
		
		//action
		
		refinedMessageArray = refinedMessage.split("~");
		
		//return
		
		return(refinedMessageArray);
		
	}
	
}
