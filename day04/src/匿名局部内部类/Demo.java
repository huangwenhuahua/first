package 匿名局部内部类;

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
		//使用匿名的子类
		fun(new IPerson(){
			public void work() {
				System.out.println("匿名子类的work...");
			}
		});
		Student stu = new Student();
		fun(stu);
		
	}
	public static void fun(IPerson p){
		p.work();
	}
}