package assignments.week3.day2;

public class Desktop extends PersonalComputer {

	@Override
	public void hardwareResources() {
		System.out.println("Mouse,CPU,Screen are Hardware Resources");
		
	}

	@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Windows OS Software");
		
	}

	@Override
	public void toAssemble() {
		// TODO Auto-generated method stub
		System.out.println("Assembling in progress");
		
	}
	
	public void desktopModel() {
		System.out.println("PC assemble completed ");
	}

	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.hardwareResources();
		obj.softwareResources();
		obj.toDisplayPC();
		obj.toAssemble();
		obj.desktopModel();
		
	}
}