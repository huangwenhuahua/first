package �ؿ�2_03;
//a)������(C),������֤��һ���ص�
//b)��������ʹ��ע��д��: ��֤:final�����಻���Ա��̳У����ǿ��Լ̳�������
//c)��Final_1.java��,���屻��final���ε���(FinalClass) ��
//d)��Final_1.java��,��������Sub�̳�FinalClass��,���뱨��,�������ں�ɫX����,��ʾ:The type Sub cannot subclass the final class FinalClass:
//e)����Sub,ʹ��ע�͵�,Ȼ��������д��: ��final���ε��಻�ܱ��̳�
//f)��FinalClass�̳�Final_1,����ͨ��; ��FinalClass����ʹ��ע��д��:  ��֤:��final����������Լ̳�������.
/*class Sub extends FinalClass{
	��final���ε��಻�ܱ��̳�
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
	 ��final���ε��಻�ܱ��̳�
}*/