package 关卡2_03;
//a)定义类(C),用于验证第一个特点
//b)在类上面使用注释写上: 验证:final修饰类不可以被继承，但是可以继承其他类
//c)在Final_1.java中,定义被修final修饰的类(FinalClass) 类
//d)在Final_1.java中,定义子类Sub继承FinalClass类,编译报错,把鼠标放在红色X上面,提示:The type Sub cannot subclass the final class FinalClass:
//e)把类Sub,使用注释掉,然后在下面写上: 被final修饰的类不能被继承
//f)让FinalClass继承Final_1,编译通过; 在FinalClass上面使用注释写上:  验证:被final的修饰类可以继承其他类.
/*class Sub extends FinalClass{
	被final修饰的类不能被继承
}*/
public  class Final_1 {
	public void show(){
		final int a;
		a = 10;
	}
}
class  FinalClass{
	final int a =10;
	final int b;
	public FinalClass(int b) {
		this.b = b;
	}
	
}
//- The type Sub cannot subclass the final class 
/*class Sub extends FinalClass{
	 被final修饰的类不能被继承
}*/