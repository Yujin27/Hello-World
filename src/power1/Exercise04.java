package power1;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int pencils = 534;
		int students = 30;
		
		//한 학생이 가지는 연필 수
		int pencilsPerStudent = (int) pencils / students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수
		int pencilsLeft = (int) pencils - pencilsPerStudent * students ;
		System.out.println(pencilsLeft);
	}
		
}		

