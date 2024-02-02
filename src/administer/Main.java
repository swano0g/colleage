package administer;

import java.util.Scanner;

public class Main {
	// add student
	public void func1(Scanner sc, Portal p) {
		System.out.println("enter student name:");
		String name = sc.next();
		
		p.studentAdd(name);
	}
	// add subject
	public void func2(Scanner sc, Portal p) {
		System.out.println("enter subject name:");
		String sbjname = sc.next();
		System.out.println("enter professor name:");
		String prfname = sc.next();
		System.out.println("enter subject unit:");
		int unit = sc.nextInt();
		
		p.subjectAdd(sbjname, prfname, unit);
	}
	// set score
	public void func3(Scanner sc, Portal p) {
		System.out.println("===== 전체 학생 목록 =====");
		p.printOfTotalStudent();
		System.out.println("enter student ID:");
		int stdid = sc.nextInt();
		System.out.println("===== 수강 내역 =====");
		p.printOfStudentInfo(stdid);
		System.out.println("enter subject ID:");
		int sbjid = sc.nextInt();
		System.out.println("enter score:");
		String score = sc.next();
		
		p.setScore(stdid, sbjid, score);
	}
	// showSubjectInfo
	public void func4(Scanner sc, Portal p) {
		System.out.println("Please enter the subject ID:");
		int sbjid = sc.nextInt();
		
		p.printOfSubjectInfo(sbjid);
	}
	// showStudentInfo
	public void func5(Scanner sc, Portal p) {
		System.out.println("===== 전체 학생 목록 =====");
		p.printOfTotalStudent();
		System.out.println("Please enter the student ID:");
		int stdid = sc.nextInt();
		
		p.printOfStudentInfo(stdid);
	}
	// applicationToSubject
	public void func6(Scanner sc, Portal p) {
		System.out.println("===== 전체 학생 목록 =====");
		p.printOfTotalStudent();
		System.out.println("Please enter the student ID:");
		int stdid = sc.nextInt();
		System.out.println("===== 전체 과목 목록 =====");
		p.printOfTotalSubject();
		System.out.println("Please enter the subject ID:");
		int subid = sc.nextInt();
		
		p.application(stdid, subid);
	}
	// dropToSubject
	public void func7(Scanner sc, Portal p) {
		System.out.println("===== 전체 학생 목록 =====");
		p.printOfTotalStudent();
		System.out.println("Please enter the student ID:");
		int stdid = sc.nextInt();
		p.printOfStudentInfo(stdid);
		System.out.println("Please enter the subject ID:");
		int subid = sc.nextInt();
		
		p.dropTheClass(stdid, subid);
	}
	
	
	public static void main(String[] args) {
		boolean program = true;
		Scanner sc = new Scanner(System.in);
		
		String initial = "Student management integrated system"
				+ "\nmade by LEE SANG WOO. CHAE JI MIN."
				+ "\n\n============================="
				+ "\n1 add student"
				+ "\n2 add subject"
				+ "\n3 set score"
				+ "\n4 showSubjectInfo"
				+ "\n5 showStudentInfo"
				+ "\n6 applicationToSubject"
				+ "\n7 dropToSubject"
				+ "\n8 exit program"
				+ "\ncommand input:";
		
		Portal p = Portal.getPortal();
		Main mm = new Main();
		
		while (program) {
			System.out.println(initial);
			int command = sc.nextInt();
			
			switch (command) {
			case 1:
				mm.func1(sc, p);
				break;
			case 2:
				mm.func2(sc, p);
				break;
			case 3:
				mm.func3(sc, p);
				break;
			case 4:
				mm.func4(sc, p);
				break;
			case 5:
				mm.func5(sc, p);
				break;
			case 6:
				mm.func6(sc, p);
				break;
			case 7:
				mm.func7(sc, p);
				break;
			case 8:
				program = false;
			default:
				System.out.println("error : "+ command + " is none-existent comand.");
			}
		}
	sc.close();
	}
}
