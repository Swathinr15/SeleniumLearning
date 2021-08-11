package assignments.week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "gods";
		String text2 = "dog";
		if(text1.length()==text2.length()) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			if(Arrays.equals(charArray1,charArray2)) {
				System.out.println("The given Strings are anagram");
			}
		}
			else
				System.out.println("The given Strings are not anagram");
				
		}

	}


