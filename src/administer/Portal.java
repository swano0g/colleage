package administer;
import java.util.ArrayList;

public class Portal {
	private static Portal one;
	
	ArrayList<Student> totalStudentList = new ArrayList<>();
	ArrayList<Subject> totalSubjectList = new ArrayList<>();
	
	private int serialNumber = 202410000;
	private final int serialNumberInitial = 202410001;

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
	
	
	// 학생 추가 
	public void studentAdd(String studentName){
		serialNumber++;
		this.totalStudentList.add(new Student(serialNumber, studentName));
		
		System.out.println("추가됨");
	}
	// 과목 추가 
	public void subjectAdd(String subjectName, String professorName, int unit) {
		serialSubject ++;
		totalSubjectList.add(new Subject(serialSubject, subjectName, professorName, unit));
		
		System.out.println("추가됨");
	}
	// 수강 신청 
	public void application(int studId, int subjId) {
		Student std = totalStudentList.get(studId - serialNumberInitial);
		Subject sbj = totalSubjectList.get(subjId - serialSubjectInitial);
		
		std.enroleSubject(sbj);
		sbj.register(std);
		System.out.println("수강 신청 완료");
	}
	// 수강 취소 
	public void dropTheClass(int stdId, int subId) {
		Student std = totalStudentList.get(stdId - serialNumberInitial);
		Subject sbj = totalSubjectList.get(subId - serialSubjectInitial);
		
		std.cancelSubject(sbj);
		sbj.delete(std);
	}
	// 학생 정보 출력 
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
	// 점수 부여 
	public void setScore(int studId, int subjId, String score) {
		Student std = totalStudentList.get(studId - serialNumberInitial);
		Subject sbj = totalSubjectList.get(subjId - serialSubjectInitial);
		Score scr = new Score(score);
		
		std.setScore(sbj, scr);
		sbj.setScore(std, scr);
	}
	// 과목 정보 출력 
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
	// 전체 과목 출력
	public void printOfTotalSubject() {
		for (Subject sub : totalSubjectList) {
			System.out.println(sub.getSubjectName()+"("+sub.getProfessorName()+", "+sub.getSubjectNumber()+")");
		}
	}
	// 전체 학생 출력
	public void printOfTotalStudent() {
		for (Student stu : totalStudentList) {
			System.out.println(stu.getStudentName()+"("+stu.getStudentID()+")");
		}
	}
}
