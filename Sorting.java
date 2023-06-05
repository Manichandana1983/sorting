package sort1;
import java.util.Scanner;
public class Sorting {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner obj=new Scanner(System.in);
		 * System.out.println("Enter numbers more than one"); int num=obj.nextInt();
		 */
	int arr[] = {5,6,9,8,4,5,7,8,1,2,3,6};
	for(int i=0; i<(arr.length-1); i++) {
		for(int j=i+1; j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int x=arr[i];
				arr[i]=arr[j];
				arr[j]=x;
			}
			
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}

	}

}
