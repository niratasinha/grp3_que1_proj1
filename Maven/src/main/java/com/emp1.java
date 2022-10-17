package com;

public class emp1 extends Employee implements Runnable{

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Nirata";
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "KPI";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String designation() {
		// TODO Auto-generated method stub
		return "Project Trainee";
	}

	@Override
	public int experience() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String reportingmanager() {
		// TODO Auto-generated method stub
		return "Mr.Naveen";
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Dayshift";
	}
	//Use of Thread class
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Details of 1st Employee");
	}
	
public static void main(String args[]) {
	
	Thread t1 = new Thread("Employee id");
	t1.start();
}
	
}
