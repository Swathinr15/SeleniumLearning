package assignments.week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
		int add = obj.add(10, 12, 45);
		System.out.println(add);
		int sub = obj.sub(45,3);
		System.out.println(sub);
		double mul = obj.mul(10d,1.5d);
		System.out.println(mul);
		float divide = obj.divide(10.236f,2.1245f);
		System.out.println(divide);
		}

}
