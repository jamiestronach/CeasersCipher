package CaesersCipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeasersCipTest {
	
	private CeasersCip ceasersCipher = new CeasersCip();

	@Test
	void testCiperedOffset12() {
		assertEquals("tai mdq kag pauzs fapmk", ceasersCipher.cipher("how are you doing today", 12));
	}

	@Test
	void testEmptyString() {
		assertEquals("", ceasersCipher.cipher("", 1));		
	}
	
	@Test
	void testCipheredOffset11() {
		assertEquals("tai mdq kag pauzs fapmk", ceasersCipher.cipher("how are you doing today", 11));
	}
}
