package hw;
import java.util.Scanner;
public class hw03_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		char checkChar;
		while(true){
		int positive=0;
		int negative=0;
		int ze=0;
		int a=0;
		while(true){
			a=scn.nextInt();
			if(a>0){
				positive++;
			}if(a==0){
				ze++;
			}if(a<0){
				negative++;
			}if(a==999){
				positive--;
				System.out.println("���Ʀ�"+positive+"��");
				System.out.println("�t�Ʀ�"+negative+"��");
				System.out.println("�s��"+ze+"��");
				break;
				}
		}System.out.print("�O�_�~��ϥ�Y/N");
			checkChar=scn.next().charAt(0);
			//�r���u��KEY�@���
			if(checkChar=='N'||checkChar=='n'){
				System.out.print("���¨ϥ�");
				break;
			}
			
	}
		
		
	}		
}
