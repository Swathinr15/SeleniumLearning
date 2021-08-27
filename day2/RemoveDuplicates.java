package assignments.week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Pay Pal";
		String text = name.replaceAll("\\s", "");
		char[] charArray = text.toCharArray();

		
		Set<Character> charSet = new LinkedHashSet<Character>(); 
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
		  
		  if(charSet.add(charArray[i])==false){ 
		  dupCharSet.add(charArray[i]); 
		  }
		}
		  charSet.removeAll(dupCharSet);
		  System.out.println("Set after removing duplicates "+charSet);
		
		  
		  
		 
	
	}

}
