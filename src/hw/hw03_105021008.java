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
				System.out.println("正數有"+positive+"個");
				System.out.println("負數有"+negative+"個");
				System.out.println("零有"+ze+"個");
				break;
				}
		}System.out.print("是否繼續使用Y/N");
			checkChar=scn.next().charAt(0);
			//字元只能KEY一位數
			if(checkChar=='N'||checkChar=='n'){
				System.out.print("謝謝使用");
				break;
			}
			
	}
		
		
	}		
}
