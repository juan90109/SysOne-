import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SysOneTest {

	private Compressor compressor = new Compressor();
	
	@Test
	void compressEmptyTest() {
		String result = compressor.compress("");
		assertEquals("",result);
	}
	
	@Test
	void compressSingleCharTest() {
		String result = compressor.compress("a");
		assertEquals("1A",result);
	}
	
	@Test
	void compressSingleUpperCaseCharTest() {
		String result = compressor.compress("B");
		assertEquals("1B",result);
	}
	
	@Test
	void compressMultipleSingleCharsTest() {
		String result = compressor.compress("abcd");
		assertEquals("1A1B1C1D",result);
	}
	
	@Test
	void compressLowCaseMixedCharsTest() {
		String result = compressor.compress("aaaaabbbc");
		assertEquals("5A3B1C",result);
	}
	
	@Test
	void compressUpperCaseCharsTest() {
		String result = compressor.compress("D");
		assertEquals("1D",result);
	}
	
	@Test
	void compressUpperCasesCharsTest() {
		String result = compressor.compress("AAABBAAAAABBBCCCCCCCCAAAAA");
		assertEquals("3A2B5A3B8C5A",result);
	}
	
	@Test
	void compressMixedCharsTest() {
		String result = compressor.compress("AAAbBCccCc");
		assertEquals("3A2B5C",result);
	}
	
}
