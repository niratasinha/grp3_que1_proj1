package com;

public class emp8 extends Employee implements Runnable{

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Tanvi";
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 8;
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
		return 2;
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
		System.out.println("Details of 8th Employee");
	}
	
public static void main(String args[]) {
	
	Thread t8 = new Thread("Employee id");
	t8.start();
}
}
