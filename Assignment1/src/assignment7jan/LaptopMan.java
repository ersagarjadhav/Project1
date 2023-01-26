package assignment7jan;

import java.util.Scanner;

public class LaptopMan {

	public static void main(String[] args) {
		
		Laptop obj=new Laptop();
		Scanner sc=new Scanner(System.in);
		System.out.println("the no of usb port is");
		int a=sc.nextInt();
		obj.setnoOfUSBPort(a);
		
		
		
		System.out.println("The processor speed is ");
		int b=sc.nextInt();
		obj.setprocessorSpeed(b);
		
		
		System.out.println("Usb Port is .."+obj.getnoOfUSBPort());
		System.out.println("processor speed is .."+obj.getprocessorSpeed());
	}

}
