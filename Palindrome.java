package assignments.week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("The given String \""+str+"\" is a Palindrome");
		}
		else {
			
			System.out.println("The given String \""+str+"\" is not a Palindrome");
        
		   }

	}

}
