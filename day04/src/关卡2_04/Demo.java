
package �ؿ�2_04;
//1.���������(Employee)
//a)����: ����(id),����(name)
//b)��Ϊ: ���󷽷�work()
//c)Ҫ��: �ṩsetters��gettters����
//2.���������Test
//a)�ṩmain����
//b)��main������
//i.ʹ�������ڲ��ഴ��Employee��������� e;����дwork()����
//1.�����ʽ:����Ϊ001��Ա����������Ŭ�����ô���
//ii.ʹ��setXxx������e�Ĺ��ź����Ƹ�ֵ
//iii.����e��work()����
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
//b)��main������
//i.ʹ�������ڲ��ഴ��Employee��������� e;����дwork()����
//1.�����ʽ:����Ϊ001��Ա����������Ŭ�����ô���
//ii.ʹ��setXxx������e�Ĺ��ź����Ƹ�ֵ
//iii.����e��work()����
public class Demo {
	public static void main(String[] args) {
		Employee e = new Employee(){
			public void work(){
				System.out.println("����Ϊ"+getId()+"��Ա��"+getName()+"��Ŭ�����ô���");
			}
		};
		e.setId(1);
		e.setName("������");
		e.work();
	}
}
