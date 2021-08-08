package assignments;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 21;
		boolean flag = false;
		for(int i = 2;i<=number/2;i++) {
			int rem = number%i;
			if(rem==0) {
				flag = true;
			}
		}
      if(flag==false) {
    	  System.out.println("the number is prime");
    	  }
      else
    	  System.out.println("the number is not prime");
	}

}
