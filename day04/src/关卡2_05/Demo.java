package 关卡2_05;
//某市举办一场运动会,只要是会跑的都可以参加.
//要求: 使用到接口,接口作为参数,匿名内部类.
//提示: 把跑功能抽取到接口中 ,在测试类中提供参加运动会的静态方法   
interface Run{
	public abstract void run();
}
//接口
//接口名作为形式参数类型
//匿名内部类
public class Demo  {
	public static void main(String[] args) {
		canjia(new Run(){
			public void run(){
				System.out.println("参加运动会");
			}
		});
	}
	public static void canjia(Run s){
		s.run();
	}
}
