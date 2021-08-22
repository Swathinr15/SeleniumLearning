package banking;

public class AxisBank extends BankingInfo{
	public void deposit() {
		System.out.println("Money deposited in Axis Bank");
	}
	
	public static void main(String[] args) {
		//BankingInfo bobj = new BankingInfo();
		//bobj.deposit();
		//bobj.saving();
		//bobj.fixed();
		System.out.println("Method Overriding:");
		AxisBank aobj = new AxisBank();
		aobj.deposit();
		aobj.fixed();
		aobj.saving();
		
	}

}
