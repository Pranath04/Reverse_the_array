package reverse_the_array;
import java.util.Scanner;

public class Reversearray{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int arrsize = scanner.nextInt();
		System.out.println("Enter array elements");
		int arr[]=new int[arrsize];
		for(int i=0;i<arrsize;i++) {
			arr[i]=scanner.nextInt();
		}
		int r=0;
		scanner.close();
		int ans[]=reverseing(r,arrsize,arr);
		for(int i=0;i<ans.length;i++){
	        System.out.println(ans[i]);
	    }
	}
	static int[] reverseing(int r,int arrsize,int arr[]) {
		while(arrsize-1>r) {
			int temp=arr[arrsize-1];
            arr[arrsize-1]=arr[r];
            arr[r]=temp;
			r++;
			arrsize--;
 		}
		return arr;
	}
}