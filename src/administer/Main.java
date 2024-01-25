package administer;

import java.util.Scanner;

public class Main {
	public void func1(Scanner sc, Portal p) {
		System.out.println("enter student name:");
		String name = sc.next();
		
		p.studentAdd(name);
	}
	
	public void func2(Scanner sc, Portal p) {
		System.out.println("enter subject name:");
		String sbjname = sc.next();
		System.out.println("enter professor name:");
		String prfname = sc.next();
		System.out.println("enter subject unit:");
		int unit = sc.nextInt();
		
		p.subjectAdd(sbjname, prfname, unit);
	}
	
	public void func3(Scanner sc, Portal p) {
		System.out.println("enter student ID:");
		int stdid = sc.nextInt();
		System.out.println("enter subject ID:");
		int sbjid = sc.nextInt();
		System.out.println("enter score:");
		String score = sc.next();
		
		p.setScore(stdid, sbjid, score);
	}
	public void func4(Scanner sc, Portal p) {
		System.out.println("Please enter the subject ID:");
		int sbjid = sc.nextInt();
		
		p.printOfSubjectInfo(sbjid);
	}
	public void func5(Scanner sc, Portal p) {
		System.out.println("Please enter the student ID:");
		int stdid = sc.nextInt();
		
		p.printOfSubjectInfo(stdid);
	}
	public void func6(Scanner sc, Portal p) {
		System.out.println("Please enter the student ID:");
		int stdid = sc.nextInt();
		System.out.println("Please enter the subject ID:");
		int subid = sc.nextInt();
		
		p.application(stdid, subid);
	}
	public void func7(Scanner sc, Portal p) {
		System.out.println("Please enter the student ID:");
		int stdid = sc.nextInt();
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
				+ "\n6 enroleSubject"
				+ "\n7 cancelSubject"
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
			default:
				System.out.println("error");
			}
		}
	sc.close();
	}
}
