package numberChars;

import java.util.Arrays;
import java.util.Optional;

/**
 * NumberCharsString :D
 * 
 * Class for creating strings with format "xxxxxxxxxxxxxxxx", being each x
 * a character from 'a' to 'z', and '0' to '9'. 
 * @author yonseca
 *
 */
public class NumberCharsString {

	
	static char[] charsString = new char[16];
	static char[] startCharsString = new char[16];

	/**
	 * Constructor for NumberCharsString. 
	 * @param link An optional String. Must be at least a 16 chars long. 
	 * If it's longer, it'll truncate to 16. If sorter, will be considered as
	 * non-valid and be replaced with "aaaaaaaaaaaaaaaa". 
	 */
	public NumberCharsString(Optional<String> charsString) {
		if (charsString.isPresent() && charsString.get().length() >= 16) {
			
			NumberCharsString.charsString = Arrays.copyOfRange(charsString
					.get().toCharArray(), 0,
					NumberCharsString.charsString.length);
			
		} else { // No String or non-valid.
			Arrays.fill(NumberCharsString.charsString, 'a');
		}
		startCharsString = Arrays.copyOf(NumberCharsString.charsString,
				startCharsString.length);
	}

	/**
	 * Returns the next String. 
	 * If current string is "aaaaaaaaaaaaaaaa", will return "aaaaaaaaaaaaaaab".
	 * @return String 
	 */
	public String next() {
		updateLink();
		return Arrays.toString(charsString);
	}

	/**
	 * Updates the link. Every letter will go through a to z, and 0 to 9. 
	 * This will update every character in order to create all possible
	 * combinations. 
	 */
	private void updateLink(){
		int pos = charsString.length-1;
		boolean update = false; 
		
		do{
			charsString[pos] = nextChar(charsString[pos]);
			update = (charsString[pos] == 'a');
			if(update) --pos;
		}while (update);
		
	}
	
	/**
	 * Gets the next char for that position
	 * @param char ('a'-'z','0'-'9')
	 * @return Next character ('a'-'z','0'-'9')
	 */
	private char nextChar(char character){
		if (character == 'z') {
			return '0';
		} else if(character == '9'){
			return 'a';
		} else {
			return character++;
		}
	}

}
