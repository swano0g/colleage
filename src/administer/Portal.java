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
	
	
	// add (student, subject)
	public void studentAdd(String studentName){
		serialNumber++;
		totalStudentList.add(new Student(serialNumber, studentName));
		System.out.println("Added");
	}
	public void subjectAdd(String subjectName, String professorName, int unit) {
		serialSubject ++;
		totalSubjectList.add(new Subject(serialSubject, subjectName, professorName, unit));
		System.out.println("Added");
	}
	
	// student&subject (apply, drop, set score)
	public void application(int studId, int subjId) {
		try{
		Student std = totalStudentList.get(studId - serialNumberInitial);
		Subject sbj = totalSubjectList.get(subjId - serialSubjectInitial);
		std.application(sbj);
		sbj.application(std);
		System.out.println("Complete");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Not exist.");
		}
	}
	public void dropTheClass(int stdId, int subId) {
		try {	
			Student std = totalStudentList.get(stdId - serialNumberInitial);
			Subject sbj = totalSubjectList.get(subId - serialSubjectInitial);
			std.drop(sbj);
			sbj.drop(std);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Not exist.");
		}
	}
	public void setScore(int studId, int subjId, String score) {
		try {
			Student std = totalStudentList.get(studId - serialNumberInitial);
			Subject sbj = totalSubjectList.get(subjId - serialSubjectInitial);
			Score scr = new Score(score);
			std.setScore(sbj, scr);
			sbj.setScore(std, scr);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Not exist.");
		}
	}
	
	// print information(select student, select subject, total student, total subject)
	public void printOfStudentInfo(int studId) {
		try {
			Student studentName = totalStudentList.get(studId - serialNumberInitial);
			System.out.println("===== Student Information =====");
			System.out.println("Student Name : " + studentName.getStudentName());
			System.out.println("Student ID : " + studentName.getStudentID());
			System.out.println("===== Coursework =====");
			for (Subject key : studentName.getScoreList().keySet()) {
				Score value = studentName.getScoreList().get(key);
				System.out.println(key.getSubjectName()+"("+key.getSubjectNumber()+", "+key.getUnit()+")" + " : " +value.getStr());
			}
			System.out.println("Total Grade : " + studentName.getGrade());
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Student ID is not exist.");
		}
	}
	public void printOfSubjectInfo(int subjId) {
		try {
			Subject subjectName = totalSubjectList.get(subjId - serialSubjectInitial);
			System.out.println("===== Subject Information =====");
			System.out.println("Subject Name(Subject ID) : " + subjectName.getSubjectName() + "(" + subjectName.getSubjectNumber() + ")");
			System.out.println("Professor Name : " + subjectName.getProfessorName());
			System.out.println("Unit : "+ subjectName.getUnit());
			System.out.println("===== List of students =====");
			for (Student key : subjectName.showSubjectInfo().keySet()) {
				Score value = subjectName.showSubjectInfo().get(key);
				System.out.println(key.getStudentName() + " : " +value.getStr());
			}
			System.out.println("Total Number : " + subjectName.showSubjectInfo().size());
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Subject ID is not exist.");
		}
		
	}
	public void printOfTotalSubject() {
		if (totalStudentList.isEmpty()) {
			System.out.println("Studentlist is empty");
		} else {
			for (Subject sub : totalSubjectList) {
				System.out.println(sub.getSubjectName()+"("+sub.getProfessorName()+", "+sub.getSubjectNumber()+")");
			}
		}
	}
	public void printOfTotalStudent() {
		if (totalSubjectList.isEmpty()) {
			System.out.println("Subjectlist is empty");
		} else {
			for (Student stu : totalStudentList) {
				System.out.println(stu.getStudentName()+"("+stu.getStudentID()+")");
			}
		}
	}
}
