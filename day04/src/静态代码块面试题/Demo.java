package 静态代码块面试题;

class Student{
	public static int num = 10;
	static{
		PI = 3.14;//OK的
//		System.out.println(PI);//编译错误
		System.out.println(num);//OK的
	}
	public static double PI = 1.0;
}
public class Demo {
	public static void main(String[] args) {
		System.out.println(Student.PI);
	}
}