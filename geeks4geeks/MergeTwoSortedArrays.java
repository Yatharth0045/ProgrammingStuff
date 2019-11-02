import java.util.Scanner;
import java.util.Arrays;

/*
PROBLEM STATEMENT

Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m. The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).

Note: Expected time complexity is O((n+m) log(n+m)). DO NOT use extra space.  We need to modify existing arrays as following.

Input: arr1[] = {10};
       arr2[] = {2, 3};
Output: arr1[] = {2}
        arr2[] = {3, 10}  

Input: arr1[] = {1, 5, 9, 10, 15, 20};
       arr2[] = {2, 3, 8, 13};
Output: arr1[] = {1, 2, 3, 5, 8, 9}
        arr2[] = {10, 13, 15, 20} 

Input:
First line contains an integer T, denoting the number of test cases. First line of each test case contains two space separated integers X and Y, denoting the size of the two sorted arrays. Second line of each test case contains X space separated integers, denoting the first sorted array P. Third line of each test case contains Y space separated integers, denoting the second array Q.

Output:
For each test case, print (X + Y) space separated integer representing the merged array.

Constraints:
1 <= T <= 100
1 <= X, Y <= 5*104
0 <= arr1i, arr2i <= 109

Example:
Input:
2
4 5
1 3 5 7
0 2 6 8 9
2 3
10 12
5 18 20

Output:
0 1 2 3 5 6 7 8 9
5 10 12 18 20*/

class MergeTwoSortedArrays {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		while(testCase>0){
			int arrayOneSize = scan.nextInt();
			int arrayTwoSize = scan.nextInt();
			int[] inputOneArr = new int[arrayOneSize];
			int[] inputTwoArr = new int[arrayTwoSize];
			for(int val=0;val<inputOneArr.length;val++){
				inputOneArr[val] = scan.nextInt();
			}
			for(int val=0;val<inputTwoArr.length;val++){
				inputTwoArr[val] = scan.nextInt();
			}
			for(int i=0;i<inputOneArr.length;i++){
				System.out.print(inputOneArr[i]+" ");
			}
			System.out.print(" | ");
			for (int i=0;i<inputTwoArr.length ;i++ ) {
				System.out.print(inputTwoArr[i]+" ");
			}
			findSolution(inputOneArr,inputTwoArr);
			testCase--;
		}
	}
	private static void findSolution(int[] arr1,int[] arr2){
		int p1=arr1.length-1;
		int p2=arr2.length-1;
		int pos=p1-1;
		while(p2>=0){
			if(arr1[p1]<arr2[p2]){
				p2--;
			}else{
				int temp=arr2[p2];
				arr2[p2]=arr1[p1];
				p2--;
				for(int i=pos;i>=0;i--){
					if(temp>arr1[i]){
						arr1[i+1]=temp;
						pos=i+1;
						break;
					}else{
						arr1[i+1]=arr1[i];
						if(i==0)
						arr1[i]=temp;
					}
				}
			}
			System.out.println();
			for(int i=0;i<arr1.length;i++){
				System.out.print(arr1[i]+" ");
			}
			System.out.print(" | ");
			for (int i=0;i<arr2.length ;i++ ) {
				System.out.print(arr2[i]+" ");
			}
			System.out.println();
		}
	}
}