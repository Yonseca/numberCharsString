/**
 * 
 */
package numberChars;

import java.math.BigDecimal;
import java.util.Optional;

import numberCharsStringTests.numberCharsStringNext;

/**
 * @author yonseca
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumberCharsString cadena = new NumberCharsString("");
		BigDecimal totalStrings = BigDecimal.valueOf(Math.pow(26, 16));
		System.out.printf("Total strings: %.0f", totalStrings);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		do {
			System.out.println(cadena.next() + "\r");
		} while (!cadena.getStartCharsString().equals(cadena.getCharsString()));
		
	}

}
