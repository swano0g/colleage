package administer;
import java.util.ArrayList;

public class Potal {
	ArrayList<Student> totalStudentList;
	ArrayList<Subject> totalSubjectList;
	
	
	public Potal() {}
	
	
	private int serialNumber = 202310000;
	private final int serialNumberInitial = 202310001;

	private int serialSubject = 0;
	private final int serialSubjectInitial = 1;
	
	public void studentAdd(String studentName){
		serialNumber++;
		totalStudentList.add(new Student(serialNumber, studentName));
		
		System.out.println("추가됨");
	}
	
	public void subjectAdd(String subjectName, String professorName) {
		serialSubject ++;
		totalSubjectList.add(new Subject(serialSubject, subjectName, professorName));
		
		System.out.println("추가됨");
	}
	
	public void showStudentInfo(Student studentName) {
		System.out.println("==== 학생 정보 출력 ====");
		System.out.println("학생이름 : " + studentName.studentName);
		System.out.println("학번 : " + studentName.getStudentID());
		System.out.println("수강 내역");
		for ()
		
	}

}
