package co.yedam;

public class Person {
	private String name; // private : 접근불가시 오류 (public 반대)
	private int age;
	double height;
	String bloodType;

	public String getName() { // String 타입
		return this.name; // 이름 field 반환
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() { // int 타입
		return this.age;
	}

	public void setAge(int age) { // 매개변수
		if (age < 0)// 비정상적인 값이 들어오면 0값으로 지정.
			this.age = 0;
		else
			this.age = age; // this = class
	}

	public double getHeight() { // double 타입
		return this.height;
	}

	public void setHeight(double height) { // 매개변수
		if (height < 0)// 비정상적인 값이 들어오면 0값으로 지정.
			this.height = 0;
		else
			this.height = height; // this = class
	}

	public String getBloodType() {
		return this.bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public void showInfo() { // void 반환값 없음
		System.out.println("{이름 : " + this.name //
				+ "\t" + "나이 : " + this.age //
				+ "\t" + "키 : " + this.height //
				+ "\t" + "혈액형 : " + this.bloodType);
	}

	public String getInfo() { // 반환값 있음
		return "[이름 : " + this.name //
				+ "\t" + "나이 : " + this.age //
				+ "\t" + "키 : " + this.height //
				+ "\t" + "혈액형 : " + this.bloodType;
	}
}
