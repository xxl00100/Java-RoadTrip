import java.util.Scanner;
import java.util.Scanner;
public class Day3_TestVar01{
	public static void main(String[] args){
		//ʵ�ּ���Բ���ܳ������
		System.out.println("��ϰ1");
		double r=50;
		final double PI=3.14;
		System.out.println("����PI��final���α���ַ���������Ҫȫ����д");
		double c=2*PI*r;
		double s=PI*r*r;
		System.out.println("Բ�뾶Ϊ"+r+"���ܳ��ǣ�"+c);
		System.out.println("Բ�뾶Ϊ"+r+"������ǣ�"+s);
		//��ϵ2��ʹ��scanner
		System.out.println("==============���Ƿָ���==============");
		System.out.println("��ϰ2");
		System.out.print("��ϰʹ��SCanner,������һ���������ڼ��㣬Ȼ��س���");
		Scanner sc= new Scanner(System.in);
		double r1=sc.nextDouble();
		double c1=2*PI*r1;
		double s1=PI*r*r1;
		System.out.println("Բ�뾶Ϊ"+r1+"���ܳ��ǣ�"+c1);
		System.out.println("Բ�뾶Ϊ"+r1+"������ǣ�"+s1);
		System.out.println("==============���Ƿָ���==============");
		System.out.println("��ϰ3");
		System.out.println("����ʹ��SCanner������¼�����䡢��ߡ��������Ա�");
		//����һ��scanner
		Scanner sc1= new Scanner(System.in);
		System.out.print("���������ǣ�");
		String name = sc1.next();//д����String name = sc1.nextString();����String�ķ�������next
		System.out.print("�����Ա��ǣ�");
		String sex=sc1.next();
		System.out.print("���������ǣ�");
		int age = sc1.nextInt();
		System.out.print("��������ǣ�");
		Double height = sc1.nextDouble();//������Ϊ�����С����������nextInt
		//�������ݻ�ȡ��Ϣ�����濪ʼ���
		System.out.println("���ĸ�����Ϣ���£�");
		System.out.println("����"+name+","+sex+","+"����"+age+"��,���"+height);
	}
}
