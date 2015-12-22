/**
 * 
 */
package numberCharsStringTests;

import static org.junit.Assert.*;

import java.util.Arrays;

import numberChars.NumberCharsString;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author yonseca
 *
 */
public class numberCharsStringNext {
	
	@Test
	public void testSiempreTrue(){
		assertTrue(true);
	}

	@Test
	public void testAaaaaaaaaaaaaaaa_PasaASer_aaaaaaaaaaaaaab() {
		char[] testString = new char[16];
		Arrays.fill(testString , 'a');
		testString[testString.length-1] = 'b';
		NumberCharsString cadenaPrueba = new NumberCharsString("aaaaaaaaaaaaaaaa");
		cadenaPrueba.next();
		assertArrayEquals(testString, cadenaPrueba.getCharsString());
	}
	

	@Test
	public void testAaaaaaaaaaaaaaaz_PasaASer_aaaaaaaaaaaaaa0() {
		char[] testString = new char[16];
		Arrays.fill(testString , 'a');
		testString[testString.length-1] = '0';
		NumberCharsString cadenaPrueba = new NumberCharsString("aaaaaaaaaaaaaaz");
		cadenaPrueba.next();
		assertArrayEquals(testString, cadenaPrueba.getCharsString());
	}

}
