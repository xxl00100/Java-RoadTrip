import java.util.Scanner;
public class Day5_TestArray02
{
	public static void main(String[] args)
	{
		System.out.println("��ʵ��һ�����ܣ��û��������֣��������е����ֵ����Сֵ");
		System.out.println("��ȷ����Ҫ���뼸������:");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int arr1 [] =new int [count];
		for(int i=1;i<=count;i++)
		{							//ȡ��
			System.out.print("�������"+i+"����:");
			arr1[i-1]=sc.nextInt();
		}
		System.out.print("����������ֱ�Ϊ:");
		for(int num:arr1)
		{						//��ǿforѭ������ӡ������
			System.out.print(num+"\t");
		}
		System.out.println();					//����
		int max=arrayMax(arr1);
		int min=arrayMin(arr1);
		System.out.println("����������ֵΪ:"+max);	
		System.out.println("���������СֵΪ:"+min);
		
		System.out.println("========�ָ���==============");
		System.out.println("��ϰ2������Ĳ�ѯ");
		System.out.println("����ѡ��Ҫ��Ѱ������ֵ");
		System.out.print("��ѡ��������Χ��:");
		for(int i=0;i<count;i++)
		{
			System.out.print(i+"\t");
			if (i==count-1)
			{
				System.out.println();
			}
		}
			//����Ĵ�����û��г��˿ɲ�ѯ��������Χ��
		System.out.print("�������Ѱ������ֵ:");
		int index=sc.nextInt();
		System.out.println("����Ϊ"+index+"����ֵΪ:"+arr1[index]);
		//����Ĵ��뷴����ָ��������ֵ
		//������ݴ��룬����������
		
		System.out.println("��ϰ3������Ĳ�ѯ-��������ֵ����������!");
		System.out.print("��ѡ��ֵ��Χ��:");
		for(int num: arr1)
		{
			System.out.print(num+"\t");
		}
		System.out.println( );
		//����Ĵ��������ѡֵ�����У�
		//�������û�ѡ��Ҫ��ѯ��ֵ��
		System.out.print("����֪���ĸ�ֵ��Ӧ�������أ�");
		int value = sc.nextInt();
		getIndex(value,arr1);  //���÷�����ȡ
		
		
		
	}
	//��ȡ���ֵ�ķ���
	public static int arrayMax(int arr[])
	{
		int max=0;
		//int index=0; ��ʱûʵ�����ض��ֵ
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]>max)
			{
				max=arr[i];
				//index=i;
			}
		
		}
		return max;	
	}
	//��ȡ��Сֵ�ķ���
	public static int arrayMin(int arr [])
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	
	//��ȡ����ֵ�ķ���
	public static void getIndex(int value, int arr[])
	{
	//value �ǲ�ѯֵ������arr�ǲ�ѯ�ķ�Χ��
	for(int i=0;i<arr.length;i++)
	{
	if(value==arr[i])
	{
		System.out.println("����ѯ��ֵ:"+value+"��Ӧ������ֵ��:"+i+"\t");
	}	
	}
	
	
	}
}