package �ؿ�2_05;
//ĳ�оٰ�һ���˶���,ֻҪ�ǻ��ܵĶ����Բμ�.
//Ҫ��: ʹ�õ��ӿ�,�ӿ���Ϊ����,�����ڲ���.
//��ʾ: ���ܹ��ܳ�ȡ���ӿ��� ,�ڲ��������ṩ�μ��˶���ľ�̬����   
interface Run{
	public abstract void run();
}
//�ӿ�
//�ӿ�����Ϊ��ʽ��������
//�����ڲ���
public class Demo  {
	public static void main(String[] args) {
		canjia(new Run(){
			public void run(){
				System.out.println("�μ��˶���");
			}
		});
	}
	public static void canjia(Run s){
		s.run();
	}
}
