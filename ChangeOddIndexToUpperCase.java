package assignments.week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
	char[] charArray = test.toCharArray();
	for(int i=0;i<charArray.length;i++) {
		if(i%2!=0) {
	          char upperCase = Character.toUpperCase(charArray[i]);
	          System.out.print(upperCase); 
		}
		else {
			System.out.print(charArray[i]);
		}
	}

	}
}
