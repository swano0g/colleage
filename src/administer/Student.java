package administer;
import java.util.ArrayList;

public class Student {
	private int studentID;
	public String studentName;
	private ArrayList<Subject> subjectList;
	
	
	public Student(int serialNumber, String studentName){
		this.studentID = serialNumber;
		this.studentName = studentName;
	}
	
	public void showSubjectInfo() {
		for (Subject s : subjectList) {
			System.out.println(s.subjectName + "(" + s.subjectNumber +", "+s.professorName+")");
		}
	}
	
	public void setGrade(int grade) {
		if (1 < grade && grade < 4){
			this.grade = grade;
		} else {
			System.out.println("오류입니다.");
		}
	}
	
	public int getStudentID() {
		return this.studentID;
	}
	
}
	