import java.util.Scanner;
public class Day6_TestArray01_Cretet_Delete{
	public static void main(String[] args){
		System.out.println("ʵ�ֹ��ܣ�������������Ӻ�ɾ��");
		System.out.println("Ҫ��1�����û�����һ������");
		System.out.println("Ҫ��2����ӡ�������Ͷ�Ӧ������");
		System.out.println("Ҫ��3�����û�ѡ����һ����ʹ�����ӹ��ܣ�����ɾ������");
		System.out.println("3.1:��Ϊ���ӹ��ܣ�ȷ�����ӵĸ����ͣ��������ӵ���λ�ã�Ȼ�����");
		System.out.println("3.2:��Ϊɾ�����ܣ�ȷ��ɾ���ĸ���������ɾ��������");
		System.out.println("===============�ָ���================");
		Scanner sc=new Scanner(System.in);
		System.out.print("��׼�����뼸�����أ�");
		int count0= sc.nextInt();
		int arr0 [] =new int[count0];
		for(int i=1;i<=arr0.length;i++)
		{
			System.out.print("�������"+i+"����:");
			arr0[i-1]=sc.nextInt();
		}
		//����Ĵ��������ԭʼ����Ĳɼ���
		System.out.print("�����������Ϊ:");
		for(int num:arr0)
		{
			System.out.print(num+"\t");
		}
		System.out.println();
		//����Ĵ���ʵ������Ĵ�ӡ�ͻ���
		System.out.print("��Ӧ������Ϊ:");
		for(int i=0;i<arr0.length;i++)
		{
			System.out.print("\t"+i);
		}
		System.out.println();
		//����Ĵ���ʵ�������Ĵ�ӡ
		System.out.print("��ѡ����:1.���ӹ��ܣ�2.ɾ������:");
		int function = sc.nextInt();
		if(function==1)
		{
		
			System.out.print("��ѡ�������ӹ���:");
			//������������ӷ���
			System.out.print("����ȷ��Ҫ���ӵ�λ��:");
			int index=sc.nextInt();
			System.out.print("����ȷ��Ҫ��������:");
			int newly_add_value=sc.nextInt();
			System.out.print("���Ӻ�����Ϊ:");
			addFunction(index,newly_add_value,arr0);
			

		}
		else if(function==2)
		{
			System.out.println("��ѡ����ɾ������:");
			//���������ɾ������
			/*System.out.print("����ȷ��Ҫ���ӵ�λ��:");
			int index=sc.nextInt();
			System.out.print("\t"+"����ȷ��Ҫ��������:");
			int newlyadd=sc.nextInt();
			*/
		}
		else
		{
			System.out.print("����ѡ��1����2������");
		}
		
	}
	
	//���ӵķ���
	 public static void addFunction(int index,int value,int arr[])
	{
		int arr1[]=new int[arr.length+1];
		//�����½�һ���������ڽ���
		if(index==0)
			{
				arr1[0]=value;
				for(int i=0;i<arr1.length;i++)
				{
					arr1[i+1]=arr[i];
			    }
			}
		//���ж����ʱ����ӵ���һ������
		else
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(i<index)
				{
					arr1[i]=arr[i];
				}
				else if(i==index)
				{
					arr1[i]=value;
				}
				else 
				{
					arr1[i]=arr[i-1];
				}
			}
		}
				//�����ﷸ��һ������:�����ŵ���������������ˣ����°���û�ҵ�ԭ��
		//System.out.print("����ѡ��1����2������");
		for(int i=0;i< arr1.length;i++)
		{
			
			System.out.print(arr1[i]+"\t");
			
		}
		//*/	
		}

	}	

	




















//Day6_TestArray01_Cretet_Delete.java