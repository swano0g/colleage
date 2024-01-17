package administer;
import java.util.ArrayList;

public class Potal {
	ArrayList<Student> totalStudentList;
	ArrayList<Subject> totalSubjectList;
	
	
	public Potal() {}
	
	
	private static int serialNumber = 202310000;
	private static int serialNumberInitial = 202310001;
	private int studentID;
	public String studentName;
	private int grade;
	private String address;
	ArrayList<Subject> subjectList;
	
	
	public void studentAdd(String studentName){
		serialNumber++;
		totalStudentList.add(new Student(serialNumber));
		
	
		totalStudentList.get(serialNumber - serialNumberInitial).studentName = studentName;
		
		
	}

}
