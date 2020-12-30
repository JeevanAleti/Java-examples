package HR;

import java.util.Scanner;

public class StaticParallelogram {

	//this is using static initializer block
	
	static Scanner sc = new Scanner(System.in);
	private static boolean flag = false;
	static int B = sc.nextInt();
	static int H = sc.nextInt();
	
	static {
		if(B>0 && H>0) {
			flag = true;
		}else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		sc.close();
	
	}
	
	public static void main(String args[]) {
			if(flag) {
				int area = B*H;
				System.out.println("Area of Parallelogram is: " + area);
			}
	}

}
