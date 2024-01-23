package administer;
import java.util.HashMap;


public class Subject {
	private String subjectName;
	private String professorName;
	private int subjectNumber;
	private int unit;
	private HashMap<Student, String> studentList = new HashMap<>();

	public Subject(int subjectNumber, String subjectName, String professorName, int unit) {
		this.subjectName = subjectName;
		this.professorName = professorName;
		this.subjectNumber = subjectNumber;
		this.unit = unit;
		
	}
	
	// getterFunction //
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
	
	
	// construct (register, delete, showSubjectInfo) 
	public void register(Student studentName) {
		studentList.put(studentName, "I");
	}
	
	public HashMap<Student, String> showSubjectInfo() {
		return studentList;
	}
	
	public void delete(Student studentName) {
		studentList.remove(studentName);
	}

}