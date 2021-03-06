import java.util.Scanner;
import java.util.Arrays;

/*

Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on...

Note: O(1) extra space is allowed. Also, try to modify the input array as required.

Input:
First line of input conatins number of test cases T. First line of test case contain an integer denoting the array size N and second line of test case contain N space separated integers denoting the array elements.

Output:
Output the modified array with alternated elements.

Constraints:
1 <=T<= 100
1 <=N<= 107
1 <=arr[i]<= 107

Example:
Input:
2
6
1 2 3 4 5 6
11 
10 20 30 40 50 60 70 80 90 100 110

Output:
6 1 5 2 4 3
110 10 100 20 90 30 80 40 70 50 60

*/

class RearrangeArrayAlternatively {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		while(testCase>0){
			int arraySize = scan.nextInt();
			int[] arr=new int[arraySize];
			for(int i=0;i<arr.length;i++){
				arr[i] = scan.nextInt();
			}
			findSolution(arr);
			System.out.println(Arrays.toString(arr));
			testCase--;
		}
	}
	private static void findSolution(int[] arr){
		int min=0;
		int max=arr.length-1;
		int maxVal=arr[arr.length-1]+1;
		System.out.println("maxVal : "+maxVal);
		for (int i=0;i<arr.length;i++) {
			if(i%2==0){
				arr[i]+=(arr[max]%maxVal)*maxVal;
				max--;
			}else{
				arr[i]+=(arr[min]%maxVal)*maxVal;
				min++;
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int i=0;i<arr.length;i++) {
			arr[i]/=maxVal;
		}		
	}
}