public class Day4_Testfor02{
	public static void main(String[] args){
		//ʵ������˷��ھ���
		System.out.println("�����������˷��ھ�:");
		for(int j=1;j<=9;j++){
			for(int i=1;i<=j;i++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
		System.out.println();	
		}
		//ʵ�ַ���˷��ھ���
		System.out.println("========�ָ���==============");
		System.out.println("�����������˷��ھ�:");
		for(int j=9;j>=1;j--){
			for(int i=1;i<=j;i++){
				System.out.print(i+"*"+j+"="+j*i+"\t");
			}
		System.out.println();
		}
		
	}
}