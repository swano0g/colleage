package administer;

import java.util.Scanner;

public class Main {
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
		int unit = sc.nextInt();
		
		p.subjectAdd(sbjname, prfname, unit);
	}
	
	public void func3(Scanner sc, Portal p) {
		System.out.println("enter student ID:");
		int stdid = sc.nextInt();
		System.out.println("enter subject ID:");
		int sbjid = sc.nextInt();
		System.out.println("enter score:");
		String score = sc.nextLine();
		
		p.setScore(stdid, sbjid, score);
	}
	
	public static void main(String[] args) {
		boolean program = true;
		Scanner sc = new Scanner(System.in);
		
		String initial = "Student management integrated system"
				+ "\nmade by LEE SANG WOO. CHAE JI MIN."
				+ "\n\n============================="
				+ "\n1 program exit"
				+ "\n2 add student"
				+ "\n3 add subject"
				+ "\ncommand input:";
		
		Portal p = Portal.getPortal();
		Main mm = new Main();
		
		while (program) {
			System.out.println(initial);
			int command = sc.nextInt();
			
			switch (command) {
			case 1:
				mm.func1(sc, p);
			case 2:
				mm.func2(sc, p);
			case 3:
				mm.func3(sc, p);
			}
		}
	}
}
