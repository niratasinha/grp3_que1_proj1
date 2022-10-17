package com;

public class emp7 extends Employee implements Runnable{

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Das";
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "KPI";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 70;
	}

	@Override
	String designation() {
		// TODO Auto-generated method stub
		return "Trainee";
	}

	@Override
	public int experience() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	String reportingmanager() {
		// TODO Auto-generated method stub
		return "Mr.Z";
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Day";
	}
	//Use of Thread class
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Details of 7th Employee");
	}
	
public static void main(String args[]) {
	
	Thread t7 = new Thread("Employee id");
	t7.start();
}
}
