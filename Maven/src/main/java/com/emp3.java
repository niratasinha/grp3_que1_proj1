package com;

public class emp3 extends Employee implements Runnable{

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Sham";
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "KPI";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	String designation() {
		// TODO Auto-generated method stub
		return "Project trainee";
	}

	@Override
	public int experience() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	String reportingmanager() {
		// TODO Auto-generated method stub
		return "Mr.y";
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Day";
	}

	//Use of Thread class	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Details of 3rd Employee");
	}
	
public static void main(String args[]) {
	
	Thread t3 = new Thread("Employee id");
	t3.start();
}
}
