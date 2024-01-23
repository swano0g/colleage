package administer;
import java.util.HashMap;


public class Student {
	private int studentID;
	public String studentName;
	private HashMap<Subject, Score> scoreList = new HashMap<>();
	
	
	// Constructor 
	public Student(int serialNumber, String studentName){
		this.studentID = serialNumber;
		this.studentName = studentName;
	}
	
	
	protected void enroleSubject(Subject s) {
		scoreList.put(s,new Score());
	}
	
	
	protected void cancelSubject(Subject s) {
		scoreList.remove(s);
	}
	
	
	public void setScore(Subject subject, Score score) {
		if (scoreList.containsKey(subject)) {
			scoreList.put(subject, score);
		}
		else {
			System.out.println("subject not found");
		}
	}
	
	
	public HashMap<Subject, Score> getScoreList() {
		return scoreList;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public double getGrade() {
		int unitSum = 0;
		double sum = 0;
		
		for (Subject key : scoreList.keySet()) {
			Score value = scoreList.get(key);
			if (value.getStr() == "I" ) {
				continue;
			}
		    unitSum += key.getUnit();
		    sum += key.getUnit() * value.getNum();
		}
		if (unitSum == 0) {
			return 0d;
		}
		else {
			return sum / unitSum;
		}
	}
	
}
	