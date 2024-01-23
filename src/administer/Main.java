package administer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean program = true;
		Scanner sc = new Scanner(System.in);
		
		String initial = "Student management integrated system"
				+ "\nmade by LEE SANG WOO. CHAE JI MIN."
				+ "\n\n============================="
				+ "\n1 program exit"
				+ "\n2 add student"
				+ "\n3 add subject"
				+ "\n";
		
		while (program) {
			System.out.println(initial);
			int command = sc.nextInt();
			
			switch (command) {
			case 1:
				program = false;
			case 2:
				//
			case 3:
				//
			}
		}
	}
}
