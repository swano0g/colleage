package administer;

import java.util.ArrayList;

public class Student {
	private int studentID;
	public String studentName;
	ArrayList<Subject> subjectList;
	
	
	public Student(int serialNumber){
		this.studentID = serialNumber;
	}
	
	public void setGrade(int grade) {
		if (1 < grade && grade < 4){
			this.grade = grade;
		} else {
			System.out.println("오류입니다.");
		}
	}
	
	
	
		
	}
	public int getStudentID() {
		return this.studentID;
	}
	
	public static void main(String[] args) {
		Student jimin = new Student("Chaejimin", "sinlimdong");
		jimin.takeSubject("컴퓨터프로그래밍", "A+");
		jimin.takeSubject("이산수학", "A0");
		System.out.println(jimin.getStudentID());
		for (Subject subject: jimin.subjectList) {
			subject.showSubjectInfo();
		}
		
		Student sangwoo = new Student("Leesangwoo", "samsungdong");
		System.out.println(sangwoo.getStudentID());
	}
}
	