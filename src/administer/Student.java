package administer;
import java.util.ArrayList;
import java.util.HashMap;


public class Student {
	private int studentID;
	public String studentName;
	private ArrayList<Subject> subjectList;
	private HashMap<Subject, Score> scoreList = new HashMap<>();
	
	/**
	 * member inner class ; Score 
	 * type of scores: I (not given yet, default), S (pass), U (fail), A ~ D +0- 
	 */
	
	private class Score {
		String score;
		
		private Score(String score) {
			this.score = score;
		}
	}
	
	
	// Constructor 
	public Student(int serialNumber, String studentName){
		this.studentID = serialNumber;
		this.studentName = studentName;
	}
	
	
	public void showSubjectInfo() {
		for (Subject s : subjectList) {
			System.out.println(s.subjectName + "(" + s.subjectNumber +", "+s.professorName+")");
		}
	}
	
	
	public void setGrade(subject subject, String score) {
		scoreList.put(subject, Score Score(score));
		
	}
	
	
	public int getStudentID() {
		return this.studentID;
	}
	
}
	