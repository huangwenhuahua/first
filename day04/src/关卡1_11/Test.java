package �ؿ�1_11;
class Animal{
	public void show(){
		System.out.println("show");
	}
	static{
		System.out.println("animal �ľ�̬�����");
	}
}
public class Test {
	
	static {
		System.out.println("Test ��̬�����");
	}
	public Test(){
		System.out.println("Test ���췽��");
	}
	public static void main(String[] args) {
		System.out.println("Test main����");
		Animal a = new Animal();
		Test t = new Test();
	}
}
