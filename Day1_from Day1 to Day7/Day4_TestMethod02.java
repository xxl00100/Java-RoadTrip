public class Day4_TestMethod02{
	public static void main(String[] args){
		//�ж����ݽ����Ƿ�ɹ���
		System.out.println("�ж����ݽ����Ƿ�ɹ�");
		int a=10;int b=20;
		System.out.println(a+"---ԭʼ��a;  ԭʼ��b---"+b);
		changeNum(a,b);
		System.out.println(a+"---�������ú��a;  �������ú��b---"+b);
	}
	public static void changeNum(int a,int b){
		int c;
		c=a;
		a=b;
		b=c;
		
		
	}
	
}