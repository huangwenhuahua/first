package ��̬�����;

class Demo {
	public static int  num =10;
	static {
		sum = 20;
		System.out.println("��̬����"+num);
//		System.out.println(sum);
	}
	public static int sum = 0;
	
	{
		System.out.println("��������");
	}
	public Demo(){
		System.out.println("���췽��");
	}
	
}
public class Demo2{
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(Demo.sum);
	}
}