package com;

public class emp5 extends Employee implements Runnable{

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Pinky";
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "KPI";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 40;
	}

	@Override
	String designation() {
		// TODO Auto-generated method stub
		return "Trainee";
	}

	@Override
	public int experience() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	String reportingmanager() {
		// TODO Auto-generated method stub
		return "Mr.Y";
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Night";
	}
	//Use of Thread class
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Details of 5th Employee");
	}
	
public static void main(String args[]) {
	
	Thread t5 = new Thread("Employee id");
	t5.start();
}
}
