package power1;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int pencils = 534;
		int students = 30;
		
		//�� �л��� ������ ���� ��
		int pencilsPerStudent = (int) pencils / students;
		System.out.println(pencilsPerStudent);
		
		//���� ���� ��
		int pencilsLeft = (int) pencils - pencilsPerStudent * students ;
		System.out.println(pencilsLeft);
	}
		
}		

