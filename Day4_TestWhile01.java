import java.util.Scanner;
public class Day4_TestWhile01{
	public static void main(String[] args){
		//ʵ��һ�����ܣ�����һ������i��Ȼ������Sum=1+2+3+...+i
	System.out.println("ʵ��һ�����ܣ�����һ������i��Ȼ������Sum=1+2+3+...+i");	
	Scanner sc=new Scanner(System.in);
	System.out.print("������һ��������:");
	int i=sc.nextInt(); 					//ȡ��
	int i0=i;								//�����ӡ
	int sum=0;
	while(i!=0){
		sum=sum+i;
		i--;
	}
	System.out.println("Sum=1+2+3+...+"+i0+"="+sum);
	
	System.out.println("==============���Ƿָ���==============");
	System.out.println("��ϰ2��ʹ��forѭ�����ظ�����Ĺ��� ");	
	System.out.print("������һ��������:");
	int num=sc.nextInt();
	int sum1=0;
	for(int a=0;num!=a-1;a++){
		sum1=sum1+a;
		
	}
	System.out.println("Sum=1+2+3+...+"+num+"="+sum1);
	
	
	}
}