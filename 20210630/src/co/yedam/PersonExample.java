package co.yedam;

public class PersonExample {
	public static void main(String[] args) {
		
		Person p1 = new Person(); // 앞의 이름과 같이 선언해줌
//		p1.name = "홍길동";
//		p1.age = 40;
//		p1.height = 175.5;
//		p1.bloodType = "A";
		p1.setName("홍길동");
		p1.setAge(40);
		p1.setHeight(175.5);
		p1.setBloodType("A");

		Person p2 = new Person(); // 앞의 이름과 같이 선언해줌
//		p2.name = "권가영";
//		p2.age = 24;
//		p2.height = 163.5;
//		p2.bloodType = "B";

		p2.setName("권가영");
		p2.setAge(24);
		p2.setHeight(163.5);
		p2.setBloodType("B");

		Person[] persons = { p1, p2 };

		Person p3 = new Person(); // 앞의 이름과 같이 선언해줌
//		p3.name = "오혜지";
//		p3.age = 26;
//		p3.height = 158.3;
//		p3.bloodType = "AB";

		p3.setName("오혜지");
		p3.setAge(26);
		p3.setHeight(158.3);
		p3.setBloodType("AB");

		persons = new Person[] { p1, p2, p3 };

//		for (int i =0; i < persons.length; i++) {
//			System.out.println("이름 : " + persons[i].name +"\t" + "나이 : "+ persons[i].age);
//		}
//		for (int i =0; i < persons.length; i++) {	
//			if (persons[i].bloodType.equals ("AB"))
//				System.out.println(persons[i].bloodType + "형인 사람 : " + persons[i].name);
//		}
//		for (int i =0; i < persons.length; i++) {	
//			if (persons[i].age >= 25)
//				System.out.println("25세 이상인 사람 : " + persons[i].name);

		for (int i = 0; i < persons.length; i++) {
//			if (persons[i].getAge() >= 25)
//				System.out.println("이름 : " + persons[i].getName()//
//						+ "\t" + "나이 : " + persons[i].getAge()//
//						+ "\t" + "키 : " + persons[i].getHeight()//
//						+ "\t" + "혈액형 : " + persons[i].getBloodType());
			if (persons[i].getAge() >= 25) {
				persons[i].showInfo(); // 출력식만 만들어줌
				System.out.println(persons[i].getInfo()); // 문자열읽어오기만 만들어줌
			}
		}
//		System.out.println(p1.name+","+p1.age+","+p1.height);
	}

}
