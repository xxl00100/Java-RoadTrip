import java.util.Scanner;
//ʹ��Math.random()����Ҫ����
public class Day4_Testif01{
	public static void main(String[] args){
		
		//��ϰһ��ʵ�ֹ��ܣ���������0~5���������>=10,һ�Ƚ���5<=��<10,���Ƚ����������Ƚ�
	System.out.println("��Ʒ�ּ�");
	System.out.print("����0,1,2,3,4,5��ѡ��һ����������:");
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	System.out.print("����0,1,2,3,4,5��ѡ��һ����������:");
	int num2=sc.nextInt();
	System.out.print("����0,1,2,3,4,5��ѡ��һ����������:");
	int num3=sc.nextInt();
	int sum=num1+num2+num3;
	//����������ȡ������ͣ����濪ʼ�߼�ƥ��;
	if(sum>=10){
		System.out.println("��ϲ����һ�Ƚ���");
	}
	else if(5<=sum&sum<10){
		System.out.println("��ϲ���ö��Ƚ���");
	}
	else{
		System.out.println("��ϲ�������Ƚ���");
	}
	
	
	
	//��ϰ2�� ʵ����������ֱ�ʵ��[32,98] �� [0,66]������������������
	System.out.println("==============���Ƿָ���==============");
	System.out.println("��ϰ2������ϰʹ�����������Math.random ");
	double a =Math.random();
	int b=(int)(Math.random()*10);
	System.out.println(a+"����Math.random���ɵ�");
	System.out.println(b+"����Math.random*10��ǿת���ɵ�");
	System.out.println("��ϰ3:ʵ��[32,98]��һ������� ");
	int c=(int)(Math.random()*99); //����0~98����
	int d=(int)(-1*(Math.random()*33));
	int e=c+d;
	System.out.println(e+"�ǽ���[32,98]��һ�������");
	
	
	
	
	
	
	
	
	}

}