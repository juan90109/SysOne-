
public class Compressor {

	public String compress(String stringToCompress) {
				
		String result = "";
		
		char[] separatedChars = stringToCompress.toCharArray();
		if(separatedChars.length == 0) return result;
		
		
		Character lastCharacter = null;
		int sameCharCounter = 0;
		
		for(char actualCharacter : separatedChars) {
			
			// First char:
			if(lastCharacter == null) {
				
				sameCharCounter++;
				lastCharacter = actualCharacter;
				
			}else {
				
				// Same char
				if(Character.toLowerCase(actualCharacter) == Character.toLowerCase(lastCharacter)) {
					
					sameCharCounter++;
					
				}else { //Character changed
					result += sameCharCounter;
					result += Character.toUpperCase(lastCharacter);
					
					sameCharCounter = 1;
					lastCharacter = actualCharacter;
				}
			}
		}
		
		// Last char
		result += sameCharCounter;
		result += Character.toUpperCase(lastCharacter);
		
		
		return result;
		
	}
}
