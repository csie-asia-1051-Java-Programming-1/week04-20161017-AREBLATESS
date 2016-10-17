package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class ex01_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int v1=scn.nextInt();
		int sum=0;
		int b=0;
		for(int i=0;v1!=-1;i++){
			sum=sum+v1;
			v1=scn.nextInt();
			b=sum/(i+1);}
		System.out.println(b);
		System.out.println(sum);
	}
	}
