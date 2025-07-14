import java.util.Scanner;
public class ArrayMaxMin{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int arr1[] = new int[5];
		int sum = 0;
		System.out.println("Please Enter Some Number:");
		for(int i=0;i<arr1.length;i++){
		arr1[i] = input.nextInt();
	}
		for (int i =0;i<arr1.length;i++){
			sum = sum + arr1[i];
		}
		System.out.println("The Sum of the array is: "+ sum);
		double avg = sum/(double)arr1.length;
		System.out.println("The Averge of the array is: "+ avg);
		int max = arr1[0];
		for(int i=1;i<5;i++){
			if(arr1[i]>max){
				max = arr1[i];
			}
		}
		System.out.println("The Maximum number of the array is: "+ max);
		int min = arr1[0];
		for(int i= 1;i<5;i++){
			if(arr1[i]<min){
				min = arr1[i];
			}
		}
		System.out.println("The Minimum number of the array is: "+ min);
	}
	
	
}