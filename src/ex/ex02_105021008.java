package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class ex02_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		while(true){
		int n=scn.nextInt();
		int m=scn.nextInt();
		char checkChar;
		for(int i=1;i<=n;i++){
			for(int i2=1;i2<=m;i2++){
				System.out.print(i+"x"+i2+"="+(i*i2));
				System.out.println();
			}
			
		}
		System.out.println("是否繼續Y/N");
		checkChar=scn.next().charAt(0);
		if(checkChar=='N'||checkChar=='n'){
			System.out.println("程式已結束");
			break;
		}
		}

	}

}
