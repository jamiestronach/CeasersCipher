package CaesersCipher;

public class Main {

	public static void main(String[] args) {
		
		String message = "how are you doing today";
		int offset = 12;
		
		CeasersCip ceasersCipher = new CeasersCip();
		String cipherMessage = ceasersCipher.cipher(message, offset);
		
		System.out.println("Original message: " + message + "\nNew message: " + cipherMessage);
	}

}
