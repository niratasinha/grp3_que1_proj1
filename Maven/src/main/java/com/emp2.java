package com;

public class emp2 extends Employee implements Runnable{

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Rama";
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "KPI";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	String designation() {
		// TODO Auto-generated method stub
		return "Project Trainee";
	}

	@Override
	public int experience() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	String reportingmanager() {
		// TODO Auto-generated method stub
		return "Mr.X";
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Day";
	}

	//Use of Thread class
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Details of 2nd Employee");
	}
	
public static void main(String args[]) {
	
	Thread t2 = new Thread("Employee id");
	t2.start();
}
}
