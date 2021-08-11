package assignments.week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Chennai";
		int count = 0;
		char occuranceChar = 'e';
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]==occuranceChar) {
				count+=1;
			}
			
		}
		System.out.println("The character '"+occuranceChar+"' has occured "+count+" times.");

	}

}
