import java.util.Scanner;
//�ص�ʹ����sc.hasNextInt()�������ж�����������Ƿ�Ϊ������������ٽ��н���

public class Day4_Testif02{
	public static void main(String[] args){
	
	//�û�Ա������֣����ݻ��ֶ��������ۿ�;
	System.out.println("��ϰ1�����ݻ��ֵĶ������ܲ�ͬ���ۿ�");
	Scanner sc=new Scanner(System.in);
	System.out.print("���������Ļ�Ա����:");
	if(sc.hasNextInt()==true){
		int num=sc.nextInt();
		if(num>=8000){System.out.println("�����ܵ��ۿ�Ϊ0.6");}
		else if(5000<=num&num<8000){System.out.println("�����ܵ��ۿ�Ϊ0.7");}
		else if(3000<=num&num<5000){System.out.println("�����ܵ��ۿ�Ϊ0.8");}
		else{System.out.println("�����ܵ��ۿ�Ϊ0.9");}
	}
	else{
		System.out.println("����������ݲ�������������");
	}

	System.out.println("==============���Ƿָ���==============");
/*		ʵ�ֹ��ܣ�		    С���Ѱ����ӣ�
							�������7�꣬���԰����ӣ�
							����������5�꣬�Ա����У����԰����ӣ�
							���򲻿��԰ᶯ���ӣ���ʾ���㻹̫С��
*/
	System.out.println("��ϰ2:ʵ�ֹ���С���Ӱ�����");
	Scanner sc1=new Scanner(System.in);
	System.out.print("��ѡ�������Ա�1.�У�2.Ů��");
	int sex=sc1.nextInt();
	System.out.println(sex);
	if(sex==1|sex==2){
		System.out.print("�������������䣺");
		int age = sc1.nextInt();
		if(age>7){System.out.println("���ܹ��ᶯ���ӣ�");	}
		else if(5<age & sex==1){System.out.println("���ܹ��ᶯ���ӣ�");	}
		else{System.out.println("�㲻�ܰᶯ���ӣ�");}
		
		
	}
	else{
		System.out.println("�����Ա��������������1����2");
	}


	
	}
}