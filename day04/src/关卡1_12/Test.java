package �ؿ�1_12;
//����������״̬,һ����ֹͣ,һ������; �������ڲ���һ��������;��������һ�������Ĺ���;
//�������������״̬�������ͷ�����ת,���������ֹͣ״̬,������ֹͣ����
//Ҫ��: ʹ�ó�Ա�ڲ���.

class Car {
	class ������{
		public void show(){
			if(run){
				System.out.println("����������");
			}else{
				System.out.println("������ֹͣ����");
			}
		}
	}
	boolean run;
	
}
public class Test{
	
	public static void main(String[] args) {
		Car c = new Car();
		Car.������ f = c.new ������();
		f.show();
		c.run = true;
		f.show();
	}
}