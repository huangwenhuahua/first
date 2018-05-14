package 关卡1_12;
//汽车有两种状态,一种是停止,一种运行; 汽车的内部都一个发动机;发动机有一个工作的功能;
//如果汽车的运行状态发动机就飞速旋转,如果汽车是停止状态,发动机停止工作
//要求: 使用成员内部类.

class Car {
	class 发动机{
		public void show(){
			if(run){
				System.out.println("发动机工作");
			}else{
				System.out.println("发动机停止工作");
			}
		}
	}
	boolean run;
	
}
public class Test{
	
	public static void main(String[] args) {
		Car c = new Car();
		Car.发动机 f = c.new 发动机();
		f.show();
		c.run = true;
		f.show();
	}
}