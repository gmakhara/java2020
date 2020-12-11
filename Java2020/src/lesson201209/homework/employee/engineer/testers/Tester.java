package lesson201209.homework.employee.engineer.testers;

import lesson201209.homework.employee.engineer.Engineer;

public abstract class Tester extends Engineer {

	@Override
	public void createsDocumentation() {
		System.out.println("Writes documentation how tests work");
	}
	
	@Override
	public void holdsWorkshop() {
		System.out.println("Speaks and provides examples for best practices for testing");
	}
	
}
