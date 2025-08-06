package mylab.student.control;

import mylab.student.entity.Student;
import mylab.student.exception.InvalidGradeException;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student("01", "��μ�", "��ǻ�Ͱ���", 3);
		
		System.out.println(student1.getName() + " / " + student1.getMajor() + " / " + student1.getGrade() + "�г�");
		
		try {
			System.out.println("5�г����� ����");
			student1.setGrade(5);
		} catch (InvalidGradeException e) {
			System.out.println(e.getMessage());
		}
	}
}
