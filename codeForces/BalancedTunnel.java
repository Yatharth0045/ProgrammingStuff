import java.util.Scanner;

/*
Question: Balanced Tunnel

Consider a tunnel on a one-way road. During a particular day, n cars numbered from 1 to n

entered and exited the tunnel exactly once. All the cars passed through the tunnel at constant speeds.

A traffic enforcement camera is mounted at the tunnel entrance. Another traffic enforcement camera is mounted at the tunnel exit. Perfectly balanced.

Thanks to the cameras, the order in which the cars entered and exited the tunnel is known. No two cars entered or exited at the same time.

Traffic regulations prohibit overtaking inside the tunnel. If car i
overtakes any other car j inside the tunnel, car i

must be fined. However, each car can be fined at most once.

Formally, let's say that car i
definitely overtook car j if car i entered the tunnel later than car j and exited the tunnel earlier than car j. Then, car i

must be fined if and only if it definitely overtook at least one other car.

Find the number of cars that must be fined.
Input

The first line contains a single integer n
(2≤n≤105

), denoting the number of cars.

The second line contains n
integers a1,a2,…,an (1≤ai≤n), denoting the ids of cars in order of entering the tunnel. All ai

are pairwise distinct.

The third line contains n
integers b1,b2,…,bn (1≤bi≤n), denoting the ids of cars in order of exiting the tunnel. All bi

are pairwise distinct.
Output

Output the number of cars to be fined.
Examples
Input
Copy

5
3 5 2 1 4
4 3 2 5 1

Output
Copy

2

Input
Copy

7
5 2 3 6 7 1 4
2 3 6 7 1 4 5

Output
Copy

6

Input
Copy

2
1 2
1 2

Output
Copy

0

*/

class BalancedTunnel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noOfCars = scan.nextInt();
		int[] carsIn = new int[noOfCars];
		int[] carsOut = new int[noOfCars];
		for(int i=0;i<carsIn.length;i++){
			carsIn[i]=scan.nextInt();
		}
		for(int i=0;i<carsOut.length;i++){
			carsOut[i]=scan.nextInt();
		}
		int carsFined = findSolution(carsIn,carsOut);
		System.out.println("Cars fined : "+carsFined);
	}
	private static int findSolution(int[] in,int[] out){
		int j=0;
		int counter=0;
		int finalCounter=0;
		for(int i=0;i<out.length;i++){
			if(in[j]==out[i]){
				j++;
				finalCounter=counter;
				continue;
			}
			counter++;
		}
		return finalCounter;
	}
}
