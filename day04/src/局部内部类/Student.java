package �ֲ��ڲ���;

public class Student{
	public void show(){
		final int num = 10;//��������Ϊfinal -->final int num = 10;//OK��
		class Inside{
			public void fun(){
				System.out.println(num);//�������"�ֲ��ڲ���"����"�ֲ�����"��Ҫ��"�ֲ�����"���뱻����Ϊfinal(����)
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
