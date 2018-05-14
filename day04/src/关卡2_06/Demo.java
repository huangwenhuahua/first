package 关卡2_06;
//请用代码描述： 
//某高校举成立一个大球俱乐部,只要是会打篮球,踢足球,打排球的可以参加.
//要求: 使用到接口,接口作为参数,匿名内部类.
//提示: 把打篮球,踢足球,打排球功能抽取到接口中 ,在测试类中提供加入俱乐部的静态方法,参数为接口类; 
interface Sport{
	void playBas();
	void playSco();
	void playPai();
}
public class Demo {
	public static void jiaru(Sport s){
		s.playBas();
		s.playPai();
		s.playSco();
	}
	public static void main(String[] args) {
		Sport s = new Sport(){
			public void playBas(){
				System.out.println("打篮球");
			}
			public void playSco(){
				System.out.println("踢足球");
			}
			public void playPai(){
				System.out.println("打排球");
			}
		};
		s.playBas();
		s.playPai();
		s.playPai();
		jiaru(new Sport(){
			public void playBas(){
				System.out.println("打篮球");
			}
			public void playSco(){
				System.out.println("踢足球");
			}
			public void playPai(){
				System.out.println("打排球");
			}
		});
	}
}
