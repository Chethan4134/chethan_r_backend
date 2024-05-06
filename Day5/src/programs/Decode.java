package programs;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Decode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		final String text = "chethan";
		System.out.println(text);
		String encodedText = Base64.getEncoder().encodeToString(text.getBytes("UTF-8"));
		System.out.println(encodedText);
		
		byte[] decodedArr = Base64.getDecoder().decode(encodedText);
		String decodedText = new String(decodedArr,"UTF-8");
		System.out.println(decodedText);
	}
}
