public class Day4_Testfor04{
	public static void main(String[] args){
		//��ӡ������״
		System.out.println("��ϰ1����ӡһ��9*5�ľ���");
		for(int j=0;j<=4;j++){
			for(int i=1;i<10;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("��ϰ2����ӡһ��9*5�ľ���,����ǰ����2���Ʊ�λ");
		for(int j=0;j<=4;j++){
			System.out.print("\t\t");
			for(int i=1;i<10;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("��ϰ3����ӡһ��9*5��ƽ���ı���,����ǰ����2���Ʊ�λ");
		for(int j=0;j<=4;j++){
			for(int k=8;k-j>0;k--){
				System.out.print(" ");
			}		
			for(int i=1;i<10;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========�ָ���==============");
		System.out.println("��ϰ4��������ѭ�������Ǯ�׼�����");
		System.out.println("========�ָ���==============");
		for(int i =1;i<99;i++){
			for(int j=1;j<99;j++){
				for(int k=1;k<99;k++){
					if((i+k+j==100)&(5*i+3*j+k/3==100)&(k%3==0)){
						System.out.println("����:"+i+"ֻ;"+"ĸ��:"+j+"ֻ;"+"С��:"+k+"ֻ");
					}
				}
			}
			
		}
		
		
		
		
		
		
		
	}
}