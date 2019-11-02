import java.util.Scanner;

/*

Another Codeforces Round has just finished! It has gathered n participants, and according to the results, the expected rating change of participant i is ai. These rating changes are perfectly balanced — their sum is equal to 0

Unfortunately, due to minor technical glitches, the round is declared semi-rated. It means that all rating changes must be divided by two.

There are two conditions though:

    For each participant i

, their modified rating change bi must be integer, and as close to ai2 as possible. It means that either bi=⌊ai2⌋ or bi=⌈ai2⌉. In particular, if ai is even, bi=ai2. Here ⌊x⌋ denotes rounding down to the largest integer not greater than x, and ⌈x⌉ denotes rounding up to the smallest integer not smaller than x
.
The modified rating changes must be perfectly balanced — their sum must be equal to 0

    . 

Can you help with that?
Input

The first line contains a single integer n
(2≤n≤13845

), denoting the number of participants.

Each of the next n
lines contains a single integer ai (−336≤ai≤1164), denoting the rating change of the i

-th participant.

The sum of all ai
is equal to 0

.
Output

Output n
integers bi, each denoting the modified rating change of the i

-th participant in order of input.

For any i
, it must be true that either bi=⌊ai2⌋ or bi=⌈ai2⌉. The sum of all bi must be equal to 0

.

If there are multiple solutions, print any. We can show that a solution exists for any valid input.

*/


class BalancedRatingChanges {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();
		int[] arr = new int[arraySize];
		for(int i = 0;i<arr.length;i++){
			arr[i] = scan.nextInt();
		}
		getSolution(arr);
	}
	private static void getSolution(int[] arr){
		int toggle = 0;
		for (int i = 0;i<arr.length ;i++ ) {
			if(arr[i]%2==1){
				
			}
		}
	}
}