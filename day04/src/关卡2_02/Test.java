package 关卡2_02;

class Student {
	static {
		System.out.println("Student 类的静态代码块");
	}
	public Student(){
		System.out.println("Student 类的构造方法");
	}
	public Student(String methodName){
		System.out.println("在"+methodName+"方法中创建Student对象调用的");
	}
}
public class Test {
	
	static {
		System.out.println("Test 类的静态代码块");
	}
	
	public static void main(String[] args) {
     System.out.println("执行main方法");
//		创建学生对象
		Student s1 = new Student("main");
	}
}