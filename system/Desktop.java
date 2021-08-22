package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Displaying desktop size");
	}
public static void main(String[] args) {
	System.out.println("Computer class:");
	Computer obj1 = new Computer();
	obj1.computerModel();
	System.out.println("Desktop class:");
	Desktop obj2 = new Desktop();
	obj2.desktopSize();
	obj2.computerModel();
}
}
