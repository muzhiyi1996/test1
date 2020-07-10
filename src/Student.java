
public class Student extends Person {

	private int grade;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void test() {
		System.out.println("考试");
	}
	
	public String test(String name) {
		System.out.println("考试");
		return null;
	}
	
	public static void main(String[] args) {
	}
	
	
}
