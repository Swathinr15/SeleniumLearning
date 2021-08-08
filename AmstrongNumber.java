package assignments;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 143;
		int calculated = 0;
		int remainder;
		int original;
		original=number;
		while (number > 0) {
			remainder = number%10;
			int quotient = number/10;
			calculated = calculated + (remainder*remainder*remainder);
			number = quotient;
		}
		if(calculated==original) {
			System.out.println("The number "+original+" is an Amstrong number");
		
		}
		else
		{
			System.out.println("The number "+original+" is not an Amstrong number");
		}
	}

}
