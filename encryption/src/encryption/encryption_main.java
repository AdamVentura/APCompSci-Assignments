/*
 * Adam Ventura
 * 4/20
 * This is a program that encrypts your messages by changing it to a letter 5 letters ahead in the alphabet
 */
package encryption;

public class encryption_main {

	public static void main(String[] args) {
		// Create instance of encryption class
		encryption e = new encryption();
		// Call method to get the users message
		String sMessage = e.GetMessage();
		// call method to convert the alphabet to an array
		char[] cAlphabet = e.ConvertAlphabet();
		// Call the encryption method
		String sEncryptedMessage = e.EncryptMessage(sMessage, cAlphabet);
		// Call method to print the encrypted message
		e.PrintEncryptedMessage(sEncryptedMessage);
	}

}
