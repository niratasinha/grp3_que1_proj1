package com;

public class emp6 extends Employee implements Runnable{

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Mani";
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "KPI";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	String designation() {
		// TODO Auto-generated method stub
		return "Mgr";
	}

	@Override
	public int experience() {
		// TODO Auto-generated method stub
		return 10;
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
		System.out.println("Details of 6th Employee");
	}
	
public static void main(String args[]) {
	
	Thread t6 = new Thread("Employee id");
	t6.start();
}
}
