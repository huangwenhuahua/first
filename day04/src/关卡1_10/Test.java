package 关卡1_10;

class Student {
//	学校
	public static String school  = "清华大学";
//	姓名
	private String name;
//	年龄
	private int age;

//	构造方法
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("景甜",22);
		Student s2 = new Student("林思意",18);
		System.out.println(s1.school);
		s1.school = " 传智播客";
		System.out.println(s2.school);
	}
}