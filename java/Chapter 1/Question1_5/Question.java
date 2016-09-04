package Question1_5;

public class Question {

	public static String compress (String s) {
		if (s.length() <= 0)
			return new String("");
		char value = s.charAt(0);
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < s.length(); i ++) {
			if (value == s.charAt(i)) {
				count ++;
			} else {
				sb.append(value).append(count);
				value = s.charAt(i);
				count = 1;
			}
		}
		sb.append(value).append(count);
		String newS = sb.toString();
		if (newS.length() >= s.length()) {
			return s;
		} else {
			return newS;
		}
	}
	
	public static void main(String[] args) {
		String str = "abbccccccde";
		String str2 = compress(str);
		System.out.println("Compression: " + str2);
		System.out.println("Old String (len = " + str.length() + "): " + str);
		System.out.println("New String (len = " + str2.length() + "): " + str2);
	}
}
