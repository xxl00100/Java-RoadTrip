import java.util.Scanner;
public class Day4_ReviewDay3_01{
	public static void main(String[] args){
		//ʵ�ֹ�������һ����������Բ������ܳ�
	System.out.println("��ϰDay3��ȡ������Բ��������ܳ�");
	final double PI=3.14;
	Scanner sc=new Scanner(System.in);
	System.out.print("������Բ�뾶��");
	double r=sc.nextDouble();
	double cu=2*PI*r;
	double s=PI*r*r;
	System.out.println("�뾶Ϊ"+r+"��Բ�ܳ���:"+cu+",Բ�����:"+s);
	
	System.out.println("==============���Ƿָ���==============");
	System.out.println("��ϰ2:��������һ����λ����Ȼ��ֱ����ÿһ��λ���ϵ�����");
	System.out.print("������һ����λ������:");
	int num=sc.nextInt();
	String str=String.valueOf(num);
	char a,b,c,d;
	a=str.charAt(0);
	b=str.charAt(1);
	c=str.charAt(2);
	d=str.charAt(3);
	System.out.println("���������λ��:"+num+"��ǧ��λ��:"+a+",�ٷ�λ��:"+b
	+",ʮ��λ��:"+c+",��λ��:"+d);
	
	
	System.out.println("==============���Ƿָ���==============");
	System.out.println("��ϰ3:����¼�����䡢��ߡ��������Ա�");
	System.out.print("��������������:");
	String name=sc.next();
	System.out.print("��ѡ�������Ա�:1.Male;2.Female:");
	int choice=sc.nextInt();
	String sex=(choice==1?"Male":"Female");
	System.out.print("����������������:");
	int age=sc.nextInt();
	System.out.print("���������������:");
	double height=sc.nextDouble();
	System.out.println("���ĸ�����Ϣ���£�");
	System.out.println("����"+name+","+sex+","+"����"+age+"��,���"+height);
	
	System.out.println("==============���Ƿָ���==============");
	System.out.println("��ϰ4:ʵ�ֹ��ܣ�������Ů��ȷ�����������һ��������к��ģ���֮�����Ů����");
	System.out.println("��͵�ѡ����:1.����;2.�в�;3.���;4.�տ�");
	System.out.print("���к��������ֽ���ѡ��:");
	int Boy_Choice=sc.nextInt();
	System.out.print("��Ů���������ֽ���ѡ��:");
	int Girl_Choice=sc.nextInt();
	System.out.println(Girl_Choice==Boy_Choice?"���к���":"��Ů����");
	
	}
}