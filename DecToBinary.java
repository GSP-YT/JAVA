import java.util.*;
public class DecToBinary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal Number : ");
		int n = sc.nextInt();
		sc.close();
		int binary = 0;
		int rem;
		int  rev = 1;
		System.out.println("Decimal = " + n);	
		while(n != 0 && n != 1){
			if(n%2==0){
				binary = binary * 10 + 0;
			}
			else if(n%2 == 1){
				binary = binary * 10 + 1;
			}
			n = n / 2;
			System.out.println("N = " + n);	
		}
		//while(binary != 0){
		//	rem = binary % 10;
		//	rev = rev * 10 + rem;
		//	binary = binary / 10;
		//}
		binary = rev;
		System.out.println("Binary = " + binary);	
	}
}