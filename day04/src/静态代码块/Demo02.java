package ¾²Ì¬´úÂë¿é;

class Animal {
	final int a;
	static int b = 10;
	 class Dog{
		 {
			b = 20;
			System.out.println("¾²Ì¬´úÂë"+b);
//		System.out.println(sum);
		}
		
	}
	public Animal(int a) {
		this.a = a;
	}
	public void show(){
		class A {
			int a;
		}
		A a = new A();
	}
}
public class Demo02 {
	public static void main(String[] args) {
		Animal a = new Animal(9);
		Animal.Dog d = a.new Dog();
		
	}

}
