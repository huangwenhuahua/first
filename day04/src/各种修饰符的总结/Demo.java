package 各种修饰符的总结;
abstract class Person{
	public static int num = 10;
//	public abstract static void show();//错误，无法为show()方法分配空间
}
public class Demo {
	public static void main(String[] args) {
		System.out.println(Person.num);
	}
}
