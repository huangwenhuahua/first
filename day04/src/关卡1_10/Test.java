package �ؿ�1_10;

class Student {
//	ѧУ
	public static String school  = "�廪��ѧ";
//	����
	private String name;
//	����
	private int age;

//	���췽��
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
		Student s1 = new Student("����",22);
		Student s2 = new Student("��˼��",18);
		System.out.println(s1.school);
		s1.school = " ���ǲ���";
		System.out.println(s2.school);
	}
}