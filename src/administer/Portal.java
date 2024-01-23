package administer;
import java.util.ArrayList;

public class Portal {
	private static Portal one;
	
	ArrayList<Student> totalStudentList = new ArrayList<>();
	ArrayList<Subject> totalSubjectList = new ArrayList<>();
	
	private int serialNumber = 202310000;
	private final int serialNumberInitial = 202310001;

	private int serialSubject = 0;
	private final int serialSubjectInitial = 1;
		
	// singleton
	private Portal() {}
		
	public static Portal getPortal() {
		if (one == null) {
			one = new Portal();
		}
		return one;
	}
	
	
	
	public void studentAdd(String studentName){
		serialNumber++;
		this.totalStudentList.add(new Student(serialNumber, studentName));
		
		System.out.println("추가됨");
	}
	public void subjectAdd(String subjectName, String professorName, int unit) {
		serialSubject ++;
		totalSubjectList.add(new Subject(serialSubject, subjectName, professorName, unit));
		
		System.out.println("추가됨");
	}
	public void printOfStudentInfo(int studId) {
		Student studentName = totalStudentList.get(studId - serialNumberInitial);
		System.out.println("===== 학생 기본 정보 =====");
		System.out.println("학생이름 : " + studentName.getStudentName());
		System.out.println("학  번 : " + studentName.getStudentID());
		System.out.println("===== 학생 수강 정보 =====");
		for (Subject key : studentName.getScoreList().keySet()) {
			Score value = studentName.getScoreList().get(key);
			System.out.println(key.getSubjectName() + " : " +value.getStr());
		}
		System.out.println("평점 : " + studentName.getGrade());

	}
	
	public void setScore(int studId, int subjId, String score) {
		Student std = totalStudentList.get(studId - serialNumberInitial);
		Subject sbj = totalSubjectList.get(subjId - serialSubjectInitial);
		Score scr = new Score(score);
		
		std.setScore(sbj, scr);
		sbj.setScore(std, scr);
	}


	
	public void printOfSubjectInfo(int subjId) {
		Subject subjectName = totalSubjectList.get(subjId - serialSubjectInitial);
		System.out.println("===== 과목 기본 정보 =====");
		System.out.println("과목 이름(과목 번호) : " + subjectName.getSubjectName() + "(" + subjectName.getSubjectNumber() + ")");
		System.out.println("교수 : " + subjectName.getProfessorName());
		System.out.println("===== 수강 학생 목록 =====");
		for (Student key : subjectName.showSubjectInfo().keySet()) {
			Score value = subjectName.showSubjectInfo().get(key);
			System.out.println(key.getStudentName() + " : " +value.getStr());
		}
		System.out.println("총 수강생 : " + subjectName.showSubjectInfo().size());
	}
}
