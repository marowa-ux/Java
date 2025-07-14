import java.util.Arrays;
public class Array_Practice{
	public static void main(String[] args){
		/*
		Older way to Declare Array In java.
		int[] numbers = new int[5];
		numbers[0] = 5;
		numbers[1] = 15;
		numbers[2] = 51;
		System.out.println(Arrays.toString(numbers));
		*/
		//The new Way of Declaring an array
		int numbers[] ={5,15,12,51,45,47};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}