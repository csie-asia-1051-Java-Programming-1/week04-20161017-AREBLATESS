package hw;
import java.util.Scanner;
public class hw04_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
		switch(m){
		case 1:
				int n=scn.nextInt();
				int n2=(n+1)/2;
				int n3=n2;
				int m1=1;
				for(int i=n;i>n3-1;i--){
					for(int i2=n2;i2>0;i2--){
						System.out.print("@");
						}
					n2--;
					System.out.println();
					}
//@@@
//@@
//@
					for(int g=2;g<=n3;g++){
						for(int i3=0;i3<=m1;i3++){
							System.out.print("@");
						}
						m1++;
						System.out.println();
					}
//@@
//@@@
			break;
		case 2:
			int bn=scn.nextInt();
			int bn2=(bn+1)/2;
			int bn3=bn2;
			int bm1=1;
				for(int g=1;g<=bn2;g++){
					for(int i3=1;i3<=bm1;i3++){
					System.out.print("%");
				}
				bm1++;
				System.out.println();}
//%
//%%
//%%%
				for(int i=bn;i>bn3;i--){
					for(int i2=bn2-1;i2>0;i2--){
						System.out.print("%");
					}
					bn2--;
					System.out.println();}
//%%
//%
			break;
		case 3:
		int cn=scn.nextInt();//5
		int space=(cn-1)/2;//2
		int space2=space;
		int space3=space;
		int star=cn-2;
		
		int star1=1;
			for(int o=1;o<=cn/2+1;o++){
		for(int i2=1;i2<=space;i2++){
			System.out.print(" ");
		}space--;
		for(int i=1;i<=star1&&i<=cn;i++){
			System.out.print("*");
		}star1+=2;
		System.out.println();}
		
		
		
		for(int o=space3+2;o<=cn;o++){
		for(int i2=space3;i2<=space2&&space2<cn-1;i2++){
			System.out.print(" ");
				}space2++;
		for(int i=1;i<=star;i++){
			System.out.print("*");
				}star-=2;
		System.out.println();}
			break;
		case 4:
			System.out.print("абаб╗о╔н");
			break;
		
		}

	}

}


/*case 1:
int n=scn.nextInt();
int n2=(n+1)/2;
	for(int i=n;i>0;i--){
		for(int i2=n2;i2>0;i2--){
			System.out.print("@");
		}
		n2--;
		System.out.println();}
		*/
//@@@
//@@
//@




/*
  		int n=scn.nextInt();
		int n2=(n+1)/2;
		int m1=1;
			for(int g=2;g<=n2;g++){
				for(int i3=0;i3<=m1;i3++){
				System.out.print("@");
			}
			m1++;
			System.out.println();}*/
//@@
//@@@



/*case 2:
int n=scn.nextInt();
int n2=(n+1)/2;
int m1=1;
	for(int g=1;g<=n2;g++){
		for(int i3=1;i3<=m1;i3++){
		System.out.print("#");
	}
	m1++;
	System.out.println();}
	break;
*/
//#
//##
//###

/*
int n=scn.nextInt();
int n2=(n+1)/2;
for(int i=n;i>0;i--){
	for(int i2=n2-1;i2>0;i2--){
		System.out.print("#");
	}
	n2--;
	System.out.println();}
*/
//##
//#

/*case 3:
 * case 3:
  		int cn=scn.nextInt();
		int space=(cn-1)/2;
		int star1=1;
			for(int o=1;o<=cn;o++){
		for(int i2=1;i2<=space;i2++){
			System.out.print(" ");
		}space--;
		for(int i=1;i<=star1;i++){
			System.out.print("*");
		}star+=2;
		System.out.println();}
//  *
// ***
//*****
 */
