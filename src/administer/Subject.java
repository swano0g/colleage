package administer;
import java.util.ArrayList;

public class Subject {
	private String subjectName;
	private String professorName;
	private int subjectNumber;
	private ArrayList<Student> studentList;

	public Subject(int subjectNumber, String subjectName, String professorName) {
		this.subjectName = subjectName;
		this.professorName = professorName;
		this.subjectNumber = subjectNumber;
	}
	
	public void enrolment(Student studentName) {
		studentList.add(studentName);
	}
	
	public void printEnroledStudents() {
		for(int i = 0; i < studentList.size(); i++) {
			System.out.print(studentList.get(i) + " ");
			System.out.print("\n");
			System.out.print("Total: " + studentList.size());
		}
	}
	
	public void showSubjectInfo() {
		System.out.println(subjectName + " : ");
	}

	public String getSubjectName() {
		return subjectName;
	}
}