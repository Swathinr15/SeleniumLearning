package assignments.week2.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "re567hhj";
		int sum = 0;
		/*
		 * String replaced =text.replaceAll("\\D",""); 
		 * System.out.println(replaced);
		 * char[] charArray = replaced.toCharArray(); 
		 * for(int i=0;i<charArray.length;i++) { 
		 * char c = charArray[i]; 
		 * int numericValue = Character.getNumericValue(c); 
		 * sum = sum+numericValue; 
		 * }
		 * System.out.println(sum);
		 */
		for (int i = 0; i < text.length(); i++) {
			char characterAt = text.charAt(i);
			// System.out.println(characterAt);
			if (Character.isDigit(characterAt)) {
				int numericValue = Character.getNumericValue(characterAt);
				sum = sum + numericValue;
			}
		}
		System.out.println(sum);

	}

}
