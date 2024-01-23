package administer;

import java.util.Scanner;

public class Main {
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
				+ "\n6 exit program"
				+ "\ncommand input:";
		
		while (program) {
			System.out.println(initial);
			int command = sc.nextInt();
			
			switch (command) {
			case 1:
				//
			case 2:
				//
			case 3:
				//
			case 4:
				int numberOfSuject = sc.nextInt();
				p.printOfSubjectInfo(int numberOfSuject);
			case 5:
				int numberOfStudent = sc.nextInt();
				p.printOfStudentInfo(int numberOfStudent);
			case 6:
				program = false;
			}
		sc.close();
		}
	}
}
