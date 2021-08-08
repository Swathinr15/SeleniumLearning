package assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;
		int range = 6;
		System.out.println("Fibonacci series is :");
		System.out.println(firstNum);
		System.out.println(secondNum);
		for(int i=1;i<=range;i++) {
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.println(sum);
			}
		}

}
