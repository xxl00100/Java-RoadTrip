import java.util.Scanner;
public class Day5_TestArray01{
	public static void main(String[] args){
		//��ʵ��һ�����ܣ�¼��ʮ�����������ͣ��Լ�ƽ����
		System.out.println("��ʵ��һ�����ܣ�¼��ʮ�����������ͣ��Լ�ƽ��");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<11;i++){
			System.out.print("�������"+i+"����:");
			int score=sc.nextInt();
			sum+=score;
		}
		System.out.println("�������ʮ�����ĺ���:"+sum);
		System.out.println("�������ʮ�����ľ�ֵ��:"+(sum/10));
		
		System.out.println("========�ָ���==============");
		System.out.println(" ����Ĺ����޷��洢������Ǹ�����  ---��ʹ�����������ϰ2��");
		System.out.println("����1.ʹ���������û�ȷ��Ҫ���뼸�����֣�");
		System.out.println("����2.��ӡ�û�������������֣�");
		System.out.println("����3.����Լ�ƽ��ֵ��");
		System.out.print("���ã���ȷ����Ҫ��������ָ�����");
		int count=sc.nextInt();
		int arr2 [];
		arr2 =new int [count];
		//int arr2[]=new int [count];
		int sum2=0;
		for(int i=1;i<=count;i++){
			System.out.print("�������"+i+"����:");
			arr2[i-1]=sc.nextInt();
			sum2+=arr2[i-1];
		}
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		System.out.println("�������"+count+"�����ĺ���:"+sum2);
		System.out.println("�������"+count+"�����ľ�ֵ��:"+(sum2/count));
		
	}
}