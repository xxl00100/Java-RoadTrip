public class Day4_TestBreak01{
	public static void main(String[] args){
		//��ϰ1��ʹ��break����ѭ������1��100��ͣ���sum����1314ʱ�����������i��
	System.out.println("��ϰ1��ʹ��break����ѭ����");	
	System.out.println("��1��100��ͣ���sum����1314ʱ�����������i");	
	int sum=0;
	for(int i=1;i<=100;i++){
		sum=sum+i;
		
		if(sum<=1314){
			System.out.print(i+"+");
		}
		else{
			System.out.print("="+sum);
			break;}
	}
	
	
	
	
	}
}