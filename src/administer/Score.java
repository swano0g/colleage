package administer;
import java.util.HashMap;

public class Score {
	public String score;
	public HashMap<String, Double> scoreTable = new HashMap<String, Double>() {private static final long serialVersionUID = 1L;

	{
		put("A+", 4.3);
		put("A0", 4.0);
		put("A-", 3.7);
		put("B+", 3.3);
		put("B0", 3.0);
		put("B-", 2.7);
		put("C+", 2.3);
		put("C0", 2.0);
		put("C-", 1.7);
		put("D+", 1.3);
		put("D0", 1.0);
		put("D-", 0.7);
		put("S", 4.3);
		put("F", 0.0);
		put("U", 0.0);
		put("I", 0.0);
	}};
	
	public Score(String score) {
		if (scoreTable.containsKey(score)) {
			this.score = score;
		} 
		else {
			System.out.println("오류입니다.");
		}
	}
	
	public String getStr() {
		return this.score;
	}
	
	public Double getNum() {
		return scoreTable.get(this.score);
	}
	
}
