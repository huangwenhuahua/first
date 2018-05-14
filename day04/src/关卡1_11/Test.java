package 关卡1_11;
class Animal{
	public void show(){
		System.out.println("show");
	}
	static{
		System.out.println("animal 的静态代码块");
	}
}
public class Test {
	
	static {
		System.out.println("Test 静态代码块");
	}
	public Test(){
		System.out.println("Test 构造方法");
	}
	public static void main(String[] args) {
		System.out.println("Test main方法");
		Animal a = new Animal();
		Test t = new Test();
	}
}
