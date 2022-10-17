package com;

public class emp9 extends Employee implements Runnable{

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Kriti";
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
		return 80;
	}

	@Override
	String designation() {
		// TODO Auto-generated method stub
		return "Trainee";
	}

	@Override
	public int experience() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	String reportingmanager() {
		// TODO Auto-generated method stub
		return "Mr.Y";
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Day";
	}

	//Use of Thread class
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Details of 9th Employee");
	}
	
public static void main(String args[]) {
	
	Thread t9 = new Thread("Employee id");
	t9.start();
}
}
