package hw;
import java.util.Scanner;
public class hw01_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int x=0;
		int y=1;
		int z=0;
		if(a>2){
		for(int i=1;i<a;i++){
			z=x+y;
			x=y;
			y=z;
			System.out.print(x+",");
		}System.out.print(y+"¡C");
		}else if(a==1){
			System.out.print(1+"¡C");
		}else if(a==2){
			System.out.print(1+","+1+"¡C");
		}

	}

}
