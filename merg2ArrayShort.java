import java.util.Scanner;
class merg2ArrayShort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array 1 : ");
		int n = sc.nextInt();
		int []array1 = new int[n];
		System.out.printf("Enter %d Positive Elements Of Array 1 : ",n);
		for(int i = 0; i < n; i++){
			array1[i]=sc.nextInt();
		}
		System.out.println("Enter Size Of Array 2 : ");
		int m = sc.nextInt();
		int []array2 = new int[m];
		System.out.printf("Enter %d Positive Elements Of Array 2 : ",m);
		for(int i = 0; i < m; i++){
			array2[i]=sc.nextInt();
		}
		int size = n + m;
		int []array3 = new int[size];
		if(array1[0] >= array2[0]){
			array3[0] = array1[0];
		}
		else {
			array3[0] = array2[0];
		}
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				if(array1[j] >= array2[j]){
					array3[j] = array1[j];
				}
				else {
					array3[j] = array2[j];
				}
			}
		}
		for(int j = 0; j < size; j++){
			System.out.print(array3[j] + "\t");
		}
		
	}
}
