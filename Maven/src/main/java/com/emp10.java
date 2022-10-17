package com;

public class emp10 extends Employee implements Runnable{

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Geeta";
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "KPI";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 90;
	}

	@Override
	String designation() {
		// TODO Auto-generated method stub
		return "Trainee";
	}

	@Override
	public int experience() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	String reportingmanager() {
		// TODO Auto-generated method stub
		return "Mr.Z";
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Night";
	}
//Use of Thread class
		public void run() {
		// TODO Auto-generated method stub
		System.out.println("Details of 10th Employee");
	}
	
public static void main(String args[]) {
	
	Thread t10 = new Thread("Employee id");
	t10.start();
}
}
