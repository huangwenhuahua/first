package ��̬�����������;

class Student{
	public static int num = 10;
	static{
		PI = 3.14;//OK��
//		System.out.println(PI);//�������
		System.out.println(num);//OK��
	}
	public static double PI = 1.0;
}
public class Demo {
	public static void main(String[] args) {
		System.out.println(Student.PI);
	}
}