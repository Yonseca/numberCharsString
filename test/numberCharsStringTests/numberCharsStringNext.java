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
	public void testAaaaaaaaaaaaaaaa_goes_aaaaaaaaaaaaaab() {
		char[] testString = new char[16];
		Arrays.fill(testString , 'a');
		testString[testString.length-1] = 'b';
		NumberCharsString cadenaPrueba = new NumberCharsString("aaaaaaaaaaaaaaaa");
		cadenaPrueba.next();
		assertArrayEquals(testString, cadenaPrueba.getCharsString());
	}
	

	@Test
	public void testAaaaaaaaaaaaaaaz_goes_aaaaaaaaaaaaaa0() {
		char[] testString = new char[16];
		Arrays.fill(testString , 'a');
		testString[testString.length-1] = '0';
		NumberCharsString cadenaPrueba = new NumberCharsString("aaaaaaaaaaaaaaaz");
		cadenaPrueba.next();
		assertArrayEquals(testString, cadenaPrueba.getCharsString());
	}

	@Test
	public void testAaaaaaaaaaaaaaa9_goes_aaaaaaaaaaaaaba() {
		char[] testString = new char[16];
		Arrays.fill(testString , 'a');
		testString[testString.length-2] = 'b';
		NumberCharsString cadenaPrueba = new NumberCharsString("aaaaaaaaaaaaaaa9");
		cadenaPrueba.next();
		assertArrayEquals(testString, cadenaPrueba.getCharsString());
	}
	


}
