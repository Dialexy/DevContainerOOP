public class StringMethods {

	public static int countVowels(String text) {
		if (text == null) return 0;
		int count = 0;
		String vowels = "aeiouAEIOU";
		for (char c : text.toCharArray()) {
			if (vowels.indexOf(c) != -1) {
				count++;
			}
		}
		return count;
	}

	public static String reverseString(String text) {
		if (text == null) return null;
		return new StringBuilder(text).reverse().toString();
	}

	public static boolean isPalindrome(String text) {
		if (text == null) return false;
		String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String reversed = new StringBuilder(cleaned).reverse().toString();
		return cleaned.equals(reversed);
	}

	public static int wordCount(String text) {
		if (text == null || text.trim().isEmpty()) return 0;
		return text.trim().split("\\s+").length;
	}

	public static void main(String[] args) {
		String testString = "A man, a plan, a canal, Panama";

		System.out.println("Vowel count: " + countVowels(testString));
		System.out.println("Reversed string: " + reverseString(testString));
		System.out.println("Is palindrome: " + isPalindrome(testString));
		System.out.println("Word count: " + wordCount(testString));
	}
}
