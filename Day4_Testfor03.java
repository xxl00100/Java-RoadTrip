import java.util.Scanner;
public class Day4_Testfor03{
	public static void main(String[] args){
		/*ʵ��һ�����ܣ�
		1.¼��ʮ��������������������666ʱ��������˳���
		2.�ж�����¼�������ĸ����������ӡ��
		3.�ж�ϵͳ���˳�״̬������ȷ¼��ʮ������Ϊ�����˳����������Ϊ�쳣��
		
		*/
		System.out.println("��ϰ1:¼��ʮ�������ж�");
		Scanner sc=new Scanner(System.in);
		int count=0;
		boolean status=true;
		for(int i=1;i<11;i++){
			System.out.print("�������"+i+"������:");
			int num=sc.nextInt();
			if(num==666){
				status=false;
				System.out.println("����������ֹ��666,�����쳣�˳�");
				break;
			}
			if(num>0){
				count++;
			}
		}
		if(status){
			System.out.println("���������˳�����һ��¼����"+count+"��������");
		}
		else {
			System.out.println("�����쳣�˳�!" );
		}
		
	}
}