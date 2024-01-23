package administer;
import java.util.ArrayList;

public class Portal {
	Portal one;
	
	ArrayList<Student> totalStudentList;
	ArrayList<Subject> totalSubjectList;
	
	private int serialNumber = 202310000;
	private final int serialNumberInitial = 202310001;

	private int serialSubject = 0;
	private final int serialSubjectInitial = 1;
		
	// singleton
	private Portal() {}
		
	public Portal getPortal() {
		if (one == null) {
			one = new Portal();
		}
		return one;
	}
	
	
	
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
		System.out.println("===== 수강 내역 ====");
		for (Student s : totalStudentList) {
			s.showSubjectInfo();
		}
	}
	
	public void setScore(int studId, int subjId, String score) {
		Student std = totalStudentList.get(studId - serialNumberInitial);
		Subject sbj = totalSubjectList.get(subjId - serialSubjectInitial);
		Score scr = new Score(score);
		
		std.setScore(sbj, scr);
		sbj.setScore(std, scr);
	}
	
}
