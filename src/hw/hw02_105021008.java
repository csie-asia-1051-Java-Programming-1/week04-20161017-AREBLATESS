package hw;

import java.util.Scanner;
public class hw02_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int total=1;
		int total2=1;
		int total3=1;
		for(int i=1;i<=a;i++){
			total*=i;
		}
		for(int i=1;i<=b;i++){
			total2*=i;
		}
		for(int i=1;i<=a-b;i++){
			total3*=i;
	}System.out.print(total/total2/total3);
	}
	}
