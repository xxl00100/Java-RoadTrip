import java.util.Scanner;
public class Day3_TestOperator01{
	public static void main(String[] args){
	System.out.println("��ϰ1����������һ����λ����Ȼ��ֱ����ÿһ��λ���ϵ�����");
	Scanner sc=new Scanner(System.in); //�ȴ���һ��scanner������ȡ���֣�
	System.out.println(System.in);
	System.out.println("������һ��4λ��������");
	int num=sc.nextInt();
	String C_num=String.valueOf(num);
	System.out.println(C_num);
										/*
										0�ʼ����ֱ�Ӱ�int��char����charAt�����CharAt��Sting�ķ�����
										1Ȼ���԰�int��String�����int�޷�ֱ��ǿתΪString
										2�������֣�string��һ������String.valueOf(int)�ܹ�ֱ��ת��
										
										*/
										//String C_num=Integer.toString(num);
										
	char a,b,c,d;
	a=C_num.charAt(0);
	b=C_num.charAt(1);
	c=C_num.charAt(2);
	d=C_num.charAt(3);
	
											/*
												int a,b;
												int c,d;//����ǧ��λ���ٷ�λ��ʮ��λ����λ��
												a=C_num.charAt(0);
												b=C_num.charAt(1);
												c=num%100/10;//���⣺����˳����ʲô����������
												d=(num%100)%10;
												*/
	System.out.println("�����������"+num+"��ǧ��λ��:"+a+",�ٷ�λ��:"
	+b+",ʮ��λ��:"+c+"��λ��:"+d);

	System.out.println("==============���Ƿָ���==============");
	System.out.println("��ϰ3:��Ԫ�����");
	System.out.println(5>9?0:100);
	System.out.println("==============���Ƿָ���==============");
	System.out.println("��ϰ4:ʵ�ֹ��ܣ�������Ů��ȷ�����������һ��������к��ģ���֮�����Ů����");
	Scanner sc1=new Scanner(System.in);
	System.out.println("������ѡ�1.�����2.����;3.������;4.�տ�");
	System.out.print("���к�����ѡ��:");
	int BoyChoice=sc1.nextInt();
	System.out.print("��Ů������ѡ��:");
	int GirlChoice=sc1.nextInt();
	System.out.println(GirlChoice==BoyChoice?"���к���":"��Ů����");


	
	}
	
}