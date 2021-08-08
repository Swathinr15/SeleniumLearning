package assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1234;
		int sum = 0;
		while(number>0) {
			int r = number%10;
			System.out.println("remainder is "+r);
			sum = sum+r;
			System.out.println("Sum is "+sum);
			int q = number/10;
			number = q;
			System.out.println("quotient is "+number);
		}
		System.out.println("Sum of digits is "+sum);

	}

}
