package operators2;

public class Operators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int marks=34;
		int marks=101;
		if (marks>=35 && marks<=45) {
			System.out.println("student pass");
		}
		else if(marks>=45 && marks<=60) {
			System.out.println(" student grade is C");
		}
		else if(marks>=60 && marks<=70) {
			System.out.println("student grade is B");
		}
		else if(marks>=70 && marks<=85) {
			System.out.println("student grade is A");
		}
		else if(marks>=85 && marks<=95) {
			System.out.println("student grade is O");
		}
		else if(marks<=35) {
			System.out.println("student failed");
		}
		else {
			System.out.println("Invalid");
		}

	}

}
