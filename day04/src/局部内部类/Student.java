package 局部内部类;

public class Student{
	public void show(){
		final int num = 10;//必须修饰为final -->final int num = 10;//OK的
		class Inside{
			public void fun(){
				System.out.println(num);//编译错误："局部内部类"访问"局部变量"，要求"局部变量"必须被声明为final(常量)
			}
		}
		Inside inner = new Inside();
		inner.fun();
	}
	public void fun(){
		new Student().show();
	}
	public static void main(String[] args) {
		Student stu  = new Student();
		stu.fun();
	}
	
}
