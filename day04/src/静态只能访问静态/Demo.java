package ��ֻ̬�ܷ��ʾ�̬;
class A{
	int  a = 10;
	static int b =20;
	public void show(){
		System.out.println(a);
		b++;
		System.out.println(b);
	}
	public static void sho(){
		b = 50;
		System.out.println(b);
	}
}
class B extends A{
	public static void  sho(){
		System.out.println("zi");
		System.out.println(b);
	}
	public void show(){
		System.out.println(++b);
	}
}
class Fu {
	public static int num = 10;
	public static void show(){
		System.out.println("Fu");
	}
}
class Zi extends Fu{
	public static void show(){
		System.out.println("Zi");
	}
}
public class Demo {
	public static void main(String[] args) {
		Zi z = new Zi();
		System.out.println(z.num);
		z.show();//Zi���--�����࿪ʼ�ң�����û��ȥ������
		
		//��̬
		Fu f = new Zi();
		f.show();//Fu���--����Fu���(�����ͨ��������д��ִ�е��������)
		
		//�ж�
		A a = new A();
		a.show();
		B b = new B();
		b.show();
		String s;
		Math m;
	}
}

