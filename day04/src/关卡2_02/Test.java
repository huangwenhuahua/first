package �ؿ�2_02;

class Student {
	static {
		System.out.println("Student ��ľ�̬�����");
	}
	public Student(){
		System.out.println("Student ��Ĺ��췽��");
	}
	public Student(String methodName){
		System.out.println("��"+methodName+"�����д���Student������õ�");
	}
}
public class Test {
	
	static {
		System.out.println("Test ��ľ�̬�����");
	}
	
	public static void main(String[] args) {
     System.out.println("ִ��main����");
//		����ѧ������
		Student s1 = new Student("main");
	}
}