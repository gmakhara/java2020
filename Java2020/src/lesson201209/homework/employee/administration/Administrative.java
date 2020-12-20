package lesson201209.homework.employee.administration;

import lesson201209.homework.employee.Employee;

public abstract class Administrative extends Employee {

	public Administrative(String firstName, String lastName, int workingHours, String position,
			double amountOfExperience) {
		super(firstName, lastName, workingHours, position, amountOfExperience);
	}

	@Override
	public void mainJob() {
		System.out.println("Provides various kind of administrative assistance");

	}

	@Override
	public void doJob(String task) {
		System.out.println("Going to work on: " + task);
	}

}
