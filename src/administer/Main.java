package administer;

import java.util.Scanner;

public class Main {
	// add (student, subject, set score)
	public void func1(Scanner sc, Portal p) {
		System.out.println("enter student name:");
		String name = sc.nextLine();
		
		p.studentAdd(name);
	}
	public void func2(Scanner sc, Portal p) {
		System.out.println("enter subject name:");
		String sbjname = sc.nextLine();
		System.out.println("enter professor name:");
		String prfname = sc.nextLine();
		System.out.println("enter subject unit:");
		int unit = Integer.parseInt(sc.nextLine());
		
		p.subjectAdd(sbjname, prfname, unit);
	}
	public void func3(Scanner sc, Portal p) {
		System.out.println("===== Total Student Table =====");
		p.printOfTotalStudent();
		System.out.println("enter student ID:");
		int stdid = Integer.parseInt(sc.nextLine());
		System.out.println("===== Application Table =====");
		p.printOfStudentInfo(stdid);
		System.out.println("enter subject ID:");
		int sbjid = Integer.parseInt(sc.nextLine());
		System.out.println("enter score:");
		String score = sc.next();
		
		p.setScore(stdid, sbjid, score);
	}
	
	// show information(subject, student)
	public void func4(Scanner sc, Portal p) {
		System.out.println("Please enter the subject ID:");
		int sbjid = Integer.parseInt(sc.nextLine());
		
		p.printOfSubjectInfo(sbjid);
	}
	public void func5(Scanner sc, Portal p) {
		System.out.println("===== Total Student Table =====");
		p.printOfTotalStudent();
		System.out.println("Please enter the student ID:");
		int stdid = Integer.parseInt(sc.nextLine());
		
		p.printOfStudentInfo(stdid);
	}
	
	// subject (application, drop)
	public void func6(Scanner sc, Portal p) {
		System.out.println("===== Total Student Table =====");
		p.printOfTotalStudent();
		System.out.println("Please enter the student ID:");
		int stdid = Integer.parseInt(sc.nextLine());
		System.out.println("===== Total Subject Table =====");
		p.printOfTotalSubject();
		System.out.println("Please enter the subject ID:");
		int subid = Integer.parseInt(sc.nextLine());
		
		p.application(stdid, subid);
	}
	public void func7(Scanner sc, Portal p) {
		System.out.println("===== Total Student Table =====");
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
				+ "\n4 show subject info"
				+ "\n5 show student info"
				+ "\n6 application to subject"
				+ "\n7 drop to subject"
				+ "\n8 exit program"
				+ "\ncommand input:";
		
		Portal p = Portal.getPortal();
		Main mm = new Main();
		
		while (program) {
			System.out.println(initial);
			int command = Integer.parseInt(sc.nextLine());
			
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
				System.out.println("End program");
				break;
			default:
				System.out.println("error : "+ command + " is none-existent comand.");
			}
		}
	sc.close();
	}
}
