package static内部类;


class Outer{
	int sum = 100;
	static class Inner{
		public void show(){
			System.out.println("inner的show方法");
		}
	}
	public void show(){
		System.out.println(Outer.this.sum);
	}
}
class Outside{
	private int num = 10;
	class Inside{
		int num = 20;
		public void show(){
			int num = 30;
			System.out.println("num = " + num);
			System.out.println("this.num= "+this.num);
			System.out.println("Ouside.this.num"+Outside.this.num);
		}
	}
}
public class Demo {
	public static void main(String[] args) {
//		Inner in = new Inner();
//		in.show();
//		new Outer.Inner().show();
		Outside out = new Outside();
		Outside.Inside inner = out.new Inside();
		inner.show();
		Outside.Inside in = new Outside().new Inside();
		in.show();
	}
}
