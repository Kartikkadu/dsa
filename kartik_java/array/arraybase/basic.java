package arraybase;


import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int[] arr=new int[n];
		 for (int i = 0; i < arr.length; i++) {
			  arr[i]=a.nextInt();
			
		}
		 for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i]+" ");
			
		}

	}

}
