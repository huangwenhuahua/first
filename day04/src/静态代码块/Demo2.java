package 静态代码块;

class Demo {
	public static int  num =10;
	static {
		sum = 20;
		System.out.println("静态代码"+num);
//		System.out.println(sum);
	}
	public static int sum = 0;
	
	{
		System.out.println("构造代码块");
	}
	public Demo(){
		System.out.println("构造方法");
	}
	
}
public class Demo2{
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(Demo.sum);
	}
}