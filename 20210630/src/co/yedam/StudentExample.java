package co.yedam;

public class StudentExample {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("OH");
		s1.setGrade(3);
		s1.setEngScore(80);
		s1.setMathScore(85);

		Student s2 = new Student();

		s2.setName("Hong");
		s2.setGrade(2);
		s2.setEngScore(70);
		s2.setMathScore(73);

		Student s3 = new Student();

		s3.setName("Wang");
		s3.setGrade(1);
		s3.setEngScore(90);
		s3.setMathScore(75);

		Student[] students = { s1, s2, s3 };

		int maxEng = 0;
//		String name = "";
		Student maxStudent = null;
		for (int i = 0; i < students.length; i++) {
			if (maxEng < students[i].getEngScore()) {
				maxEng = students[i].getEngScore();
				maxStudent = students[i];
//				name = students[i].getName();
			}
		}
//		System.out.println("최대 영어 점수:" + maxEng + name);
		System.out.println("영어점수1등=" + maxStudent.getName() + // private일때
				"\t" + "영어 점수 : " + maxStudent.getEngScore() + //
				"\t" + "수학 점수 : " + maxStudent.getMathScore());
		System.out.println("영어점수1등=" + maxStudent.name + // private 아닐때
				"\t" + "영어 점수 : " + maxStudent.engScore + //
				"\t" + "수학 점수 : " + maxStudent.mathScore);
	}
}
