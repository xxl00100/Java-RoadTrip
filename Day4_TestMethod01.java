import java.util.Scanner;
public class Day4_TestMethod01{
	public static void main(String[] args){
		//ʵ��һ��������С���ܣ�������һ������������һ������Ȼ��Ƚ��Ƿ���ͬ
		Scanner sc=new Scanner(System.in);
		System.out.print("���������ĵ���:");
		int a = sc.nextInt();
		System.out.print("���������²���:");
		int b = sc.nextInt();
		System.out.println(guessNums(a,b));
	}	
	public static String guessNums(int a,int b){
		
		return a==b?"��¶���":"��´���";
		
	}
	
	
}

