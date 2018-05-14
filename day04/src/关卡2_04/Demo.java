
package 关卡2_04;
//1.定义抽象类(Employee)
//a)属性: 工号(id),姓名(name)
//b)行为: 抽象方法work()
//c)要求: 提供setters和gettters方法
//2.定义测试类Test
//a)提供main方法
//b)在main方法中
//i.使用匿名内部类创建Employee的子类对象 e;并重写work()方法
//1.输出格式:工号为001的员工范冰冰在努力的敲代码
//ii.使用setXxx方法给e的工号和名称赋值
//iii.调用e的work()方法
abstract class Employee{
	private int id;
	private String name;
	public abstract void work();
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
//b)在main方法中
//i.使用匿名内部类创建Employee的子类对象 e;并重写work()方法
//1.输出格式:工号为001的员工范冰冰在努力的敲代码
//ii.使用setXxx方法给e的工号和名称赋值
//iii.调用e的work()方法
public class Demo {
	public static void main(String[] args) {
		Employee e = new Employee(){
			public void work(){
				System.out.println("工号为"+getId()+"的员工"+getName()+"在努力的敲代码");
			}
		};
		e.setId(1);
		e.setName("范冰冰");
		e.work();
	}
}
