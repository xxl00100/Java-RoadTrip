import java.util.Scanner;
import java.util.Arrays;
public class Day6_TestArraysTool{
	public static void main(String[] args){
		//���û�����һ�����֣�����ϰʹ��Arrays
		System.out.println("���û�����һ�����֣�����ϰʹ��Arrays");
		System.out.print("������������ĳ���:");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int arr0[]=new int [count];
		for(int i=1;i<=count;i++)
		{
			System.out.print("���������"+i+"����:");
			arr0[i-1]=sc.nextInt();
		}			
		System.out.print("ͨ��toString����:");
		System.out.print(Arrays.toString(arr0));
		System.out.println();
		Arrays.sort(arr0);
		System.out.print("ͨ��sort��������������:");
		System.out.print(Arrays.toString(arr0));
		System.out.println();
		int arr2[]=Arrays.copyOf(arr0,3);
		System.out.print("ͨ��copyOf�����鸴��ǰ3������:");
		System.out.print(Arrays.toString(arr2));
		System.out.println();
		int arr3 [] = Arrays.copyOfRange(arr0,1,3);
		System.out.print("ͨ��copyOfRange�����鸴��[1,3)������:");
		System.out.print(Arrays.toString(arr3));	
		System.out.println();		
		int arr4 [] =arr0;
		System.out.print("ͨ��equals�ж���������ֵ�Ƿ�һ��:");
		System.out.print(Arrays.equals(arr4,arr0));		
		
		
	}
}

//Day6_TestArraysTool.java