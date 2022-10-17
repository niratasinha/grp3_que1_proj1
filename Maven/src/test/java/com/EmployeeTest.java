package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {
@Test

public void evaluatesExpression() {
	Employee e1=new emp1();
	
	String tc1 = e1.name();
	int tc2 = e1.id();
	String tc3 = e1.companyname();
	int tc4 = e1.salary();
	String tc5 = e1.designation();
	int tc6 = e1.experience();
	String tc7 = e1.reportingmanager();
	String tc8 = e1.shift();
	
	assertEquals("Nirata",tc1);
	assertEquals(1,tc2);
	assertEquals("KPI",tc3);
	assertEquals(0,tc4);
	assertEquals("Project Trainee",tc5);
	assertEquals(0,tc6);
	assertEquals("Mr.Naveen",tc7);
	assertEquals("Dayshift",tc8);
	
	Employee e2=new emp2();
	
	String tc9 = e2.name();
	int tc10 = e2.id();
	String tc11 = e2.companyname();
	int tc12 = e2.salary();
	String tc13 = e2.designation();
	int tc14 = e2.experience();
	String tc15 = e2.reportingmanager();
	String tc16 = e2.shift();
	
	assertEquals("Rama",tc9);
	assertEquals(2,tc10);
	assertEquals("KPI",tc11);
	assertEquals(10,tc12);
	assertEquals("Project Trainee",tc13);
	assertEquals(1,tc14);
	assertEquals("Mr.X",tc15);
	assertEquals("Day",tc16);
	
Employee e3=new emp3();
	
	String tc17 = e3.name();
	int tc18 = e3.id();
	String tc19 = e3.companyname();
	int tc20 = e3.salary();
	String tc21 = e3.designation();
	int tc22 = e3.experience();
	String tc23 = e3.reportingmanager();
	String tc24 = e3.shift();
	
	assertEquals("Sham",tc17);
	assertEquals(3,tc18);
	assertEquals("KPI",tc19);
	assertEquals(20,tc20);
	assertEquals("Project trainee",tc21);
	assertEquals(2,tc22);
	assertEquals("Mr.y",tc23);
	assertEquals("Day",tc24);
	
Employee e4=new emp4();
	
	String tc25 = e4.name();
	int tc26 = e4.id();
	String tc27 = e4.companyname();
	int tc28 = e4.salary();
	String tc29 = e4.designation();
	int tc30 = e4.experience();
	String tc31 = e4.reportingmanager();
	String tc32 = e4.shift();
	
	assertEquals("Hari",tc25);
	assertEquals(4,tc26);
	assertEquals("KPI",tc27);
	assertEquals(30,tc28);
	assertEquals("Project Trainee",tc29);
	assertEquals(3,tc30);
	assertEquals("Mr.X",tc31);
	assertEquals("Day",tc32);
	
Employee e5=new emp5();
	
	String tc33 = e5.name();
	int tc34 = e5.id();
	String tc35 = e5.companyname();
	int tc36 = e5.salary();
	String tc37 = e5.designation();
	int tc38 = e5.experience();
	String tc39 = e5.reportingmanager();
	String tc40 = e5.shift();
	
	assertEquals("Pinky",tc33);
	assertEquals(5,tc34);
	assertEquals("KPI",tc35);
	assertEquals(40,tc36);
	assertEquals("Trainee",tc37);
	assertEquals(4,tc38);
	assertEquals("Mr.Y",tc39);
	assertEquals("Night",tc40);
	
Employee e6=new emp6();
	
	String tc41 = e6.name();
	int tc42 = e6.id();
	String tc43 = e6.companyname();
	int tc44 = e6.salary();
	String tc45 = e6.designation();
	int tc46 = e6.experience();
	String tc47 = e6.reportingmanager();
	String tc48 = e6.shift();
	
	assertEquals("Mani",tc41);
	assertEquals(6,tc42);
	assertEquals("KPI",tc43);
	assertEquals(50,tc44);
	assertEquals("Mgr",tc45);
	assertEquals(10,tc46);
	assertEquals("Mr.Y",tc47);
	assertEquals("Night",tc48);
	
Employee e7=new emp7();
	
	String tc49 = e7.name();
	int tc50 = e7.id();
	String tc51 = e7.companyname();
	int tc52 = e7.salary();
	String tc53 = e7.designation();
	int tc54 = e7.experience();
	String tc55 = e7.reportingmanager();
	String tc56 = e7.shift();
	
	assertEquals("Das",tc49);
	assertEquals(7,tc50);
	assertEquals("KPI",tc51);
	assertEquals(70,tc52);
	assertEquals("Trainee",tc53);
	assertEquals(7,tc54);
	assertEquals("Mr.Z",tc55);
	assertEquals("Day",tc56);
	
Employee e8=new emp8();
	
	String tc57 = e8.name();
	int tc58 = e8.id();
	String tc59 = e8.companyname();
	int tc60 = e8.salary();
	String tc61 = e8.designation();
	int tc62 = e8.experience();
	String tc63 = e8.reportingmanager();
	String tc64 = e8.shift();
	
	assertEquals("Tanvi",tc57);
	assertEquals(8,tc58);
	assertEquals("KPI",tc59);
	assertEquals(80,tc60);
	assertEquals("Trainee",tc61);
	assertEquals(2,tc62);
	assertEquals("Mr.X",tc63);
	assertEquals("Day",tc64);
	
Employee e9=new emp9();
	
	String tc65 = e9.name();
	int tc66 = e9.id();
	String tc67 = e9.companyname();
	int tc68 = e9.salary();
	String tc69 = e9.designation();
	int tc70 = e9.experience();
	String tc71 = e9.reportingmanager();
	String tc72 = e9.shift();
	
	assertEquals("Kriti",tc65);
	assertEquals(9,tc66);
	assertEquals("KPI",tc67);
	assertEquals(80,tc68);
	assertEquals("Trainee",tc69);
	assertEquals(6,tc70);
	assertEquals("Mr.Y",tc71);
	assertEquals("Day",tc72);
	
Employee e10=new emp10();
	
	String tc73 = e10.name();
	int tc74 = e10.id();
	String tc75 = e10.companyname();
	int tc76 = e10.salary();
	String tc77 = e10.designation();
	int tc78 = e10.experience();
	String tc79 = e10.reportingmanager();
	String tc80 = e10.shift();
	
	assertEquals("Geeta",tc73);
	assertEquals(9,tc74);
	assertEquals("KPI",tc75);
	assertEquals(90,tc76);
	assertEquals("Trainee",tc77);
	assertEquals(8,tc78);
	assertEquals("Mr.Z",tc79);
	assertEquals("Night",tc80);
}

}
