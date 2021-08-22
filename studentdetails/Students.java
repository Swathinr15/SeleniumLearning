package studentdetails;

public class Students {
	public void getStudentsInfo(int id) {
		System.out.println("Id from method with 1 arg: "+id);
		
	}
public void getStudentsInfo(int id,String name) {
	System.out.println("Id from method with 2 args: " +id);
	System.out.println("name from method with 2 args: " +name);
		
	}
public void getStudentsInfo(String email,long phoneNumber) {
	System.out.println("email from method with 2 args: "+email);
	System.out.println("phoneNumber from method with 2 args: "+phoneNumber);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj = new Students();
		obj.getStudentsInfo(25);
		obj.getStudentsInfo(12, "Swathi");
		obj.getStudentsInfo("nrswathi@gmail.com", 123456789);

	}

}
