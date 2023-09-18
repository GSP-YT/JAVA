import java.util.Scanner;
class ThreeDObject{
	public static void wholeSurface();
	public static void volume();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length Breadth Hieght Of Box :");
		int l = nextInt(), b = nextInt(), h = nextInt();
		System.out.println("Enter Length Breadth Hieght Of Box :");
		int l = nextInt(), b = nextInt(), h = nextInt();
		
	}
}
public class Box extends ThreeDObject{
	public static void wholeSurface(int l,int b,int h){
		System.out.println("Whole Surface Of Box : "+ 2(l*b + b*h+ l*h) )
	}
	public static void volume(int l,int b,int h){
		System.out.println("Volume Of Box : "+ l*b*h )
	}
}
public class Cube extends ThreeDObject{
	public static void wholeSurface(int a){
		System.out.println("Whole Surface Of Cube : "+ ^6(a*a) )
	}
	public static void volume(int l,int b,int h){
		System.out.println("Volume Of Cube : "+ a*a*a )
	}
}
public class Cylinder extends ThreeDObject{
	public static void wholeSurface(int r,int l){
		System.out.println("Whole Surface Of Cylinder : "+ 2*3.14*r(r+l) )
	}
	public static void volume(int r,int l){
		System.out.println("Volume Of Cylinder : "+ 3.14*r*r*l )
	}
}
public class Cone extends ThreeDObject{
	public static void wholeSurface(int r,int l){
		System.out.println("Whole Surface Of Cone : "+ 3.14*r(r+l) )
	}
	public static void volume(int r,int l){
		System.out.println("Volume Of Cone : "+ 3.14*r*r*l/3 )
	}
}