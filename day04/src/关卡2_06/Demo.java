package �ؿ�2_06;
//���ô��������� 
//ĳ��У�ٳ���һ��������ֲ�,ֻҪ�ǻ������,������,������Ŀ��Բμ�.
//Ҫ��: ʹ�õ��ӿ�,�ӿ���Ϊ����,�����ڲ���.
//��ʾ: �Ѵ�����,������,�������ܳ�ȡ���ӿ��� ,�ڲ��������ṩ������ֲ��ľ�̬����,����Ϊ�ӿ���; 
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
				System.out.println("������");
			}
			public void playSco(){
				System.out.println("������");
			}
			public void playPai(){
				System.out.println("������");
			}
		};
		s.playBas();
		s.playPai();
		s.playPai();
		jiaru(new Sport(){
			public void playBas(){
				System.out.println("������");
			}
			public void playSco(){
				System.out.println("������");
			}
			public void playPai(){
				System.out.println("������");
			}
		});
	}
}
