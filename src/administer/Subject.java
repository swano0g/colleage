package administer;
import java.util.HashMap;


public class Subject {
	private String subjectName;
	private String professorName;
	private int subjectNumber;
	private int unit;
	private HashMap<Student, Score> studentList = new HashMap<>();

	public Subject(int subjectNumber, String subjectName, String professorName, int unit) {
		this.subjectName = subjectName;
		this.professorName = professorName;
		this.subjectNumber = subjectNumber;
		this.unit = unit;
		
	}
	
	// getterFunction 
	public int getUnit() {
		return this.unit;
	}
	public String getSubjectName() {
		return this.subjectName;
	}
	public String getProfessorName() {
		return this.professorName;
	}
	public int getSubjectNumber() {
		return this.subjectNumber;
	}
	
	
	// construct (register, delete, showSubjectInfo, setScore) 
	public void register(Student studentName) {
		studentList.put(studentName, new Score("I"));
	}
	
	public HashMap<Student, Score> showSubjectInfo() {
		return studentList;
	}
	
	public void setScore(Student studentName, Score score) {
		if (studentList.containsKey(studentName)) {
				studentList.put(studentName, score);
		} else{
			System.out.println("student not found");
		}
	}
	
	public void delete(Student studentName) {
		studentList.remove(studentName);
	}
}