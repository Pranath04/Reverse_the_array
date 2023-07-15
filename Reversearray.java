package reverse_the_array;
import java.util.Scanner;

public class Reversearray{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
        int n= scanner.nextInt();
        System.out.println("Enter array Elements");
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter how many times array need to rotate");
        int b= scanner.nextInt();
        scanner.close();
        if (b>n){
            b%=n;
        }
        rotateArray(array,0,n-1);
        rotateArray(array,0,b-1);
        rotateArray(array,b,n-1);
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }

    static void rotateArray(int a[],int start,int end){
        int i=start,j=end,temp;
        while(i<j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }
    }
		
	
}