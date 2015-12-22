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

	
	private char[] charsString = new char[16];
	private char[] startCharsString = new char[16];

	public char[] getCharsString() {
		return charsString;
	}

	public char[] getStartCharsString() {
		return startCharsString;
	}

	/**
	 * Constructor for NumberCharsString. 
	 * @param link An optional String. Must be at least a 16 chars long. 
	 * If it's longer, it'll truncate to 16. If sorter, will be considered as
	 * non-valid and be replaced with "aaaaaaaaaaaaaaaa". 
	 */
	public NumberCharsString(String charsString) {
		if (charsString.length() >= 16) {

			for (int i = 0; i < this.charsString.length; i++) {
				this.charsString[i] = charsString.charAt(i);
			}

		} else { // No String or non-valid.
			Arrays.fill(this.charsString, 'a');
		}
		startCharsString = Arrays.copyOf(this.charsString,
				startCharsString.length);
	}

	/**
	 * Returns the next String. 
	 * If current string is "aaaaaaaaaaaaaaaa", will return "aaaaaaaaaaaaaaab".
	 * @return String 
	 */
	public String next() {
		update();
		return Arrays.toString(charsString);
	}

	/**
	 * Updates the string. Every letter will go through a to z, and 0 to 9. 
	 * This will update every character in order to create all possible
	 * combinations. 
	 */
	private void update(){
		int pos = charsString.length-1;
		boolean update = false; 
		
		do{
			charsString[pos] = nextChar(charsString[pos]);
			update = (charsString[pos] == 'a');
			if(update) --pos;
		}while (update && pos >= 0);
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
			return ++character;
		}
	}

}
