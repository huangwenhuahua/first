package �����ֲ��ڲ���;

interface IPerson{
	public void work();
}
class Student implements IPerson{
	public void work(){
		System.out.println("student");
	}
}
public class Demo {
	public static void main(String[] args) {
		//ʹ������������
		fun(new IPerson(){
			public void work() {
				System.out.println("���������work...");
			}
		});
		Student stu = new Student();
		fun(stu);
		
	}
	public static void fun(IPerson p){
		p.work();
	}
}