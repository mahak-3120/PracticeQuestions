package interviewQuest;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * 
Consider a prison gate having N horizontal rods and M vertical rods.
You are also provided with two vectors hor and ver containing the 
row number of missing horizontal rods and vertical rods respectively.
Return the area of biggest hole in the prison gate.
1 <= N, M <= 1000000
1 <= hor[i] <= N
1 <= ver[i] <= M
All the elements of a vector are distinct
O(N + M)
SKIPPING... O(AlogA + BlogB) where A = hor.size() and B = ver.size()
*/

public class PrisonBreak {
	static long largestHole(int n,int m, ArrayList<Integer> h, ArrayList<Integer> v) {
		boolean[] xs = new boolean[n+1];
		boolean[] ys = new boolean[m+1];
		for(Integer i: h)
			xs[i] = true;
		for(Integer i: v)
			ys[i] = true;
		int x_max =0,y_max=0;
		for(int i=1,j=0;i<=n;i++) {
			if(!xs[i]) j=0;
			else x_max = Math.max(x_max, ++j);
		}
		for(int i=1,j=0;i<=m;i++) {
			if(!ys[i]) j=0;
			else y_max = Math.max(y_max, ++j);
		}
		
		return (long)(x_max+1)*(y_max+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> h = new ArrayList<>();
		ArrayList<Integer> v = new ArrayList<>();
		int n=sc.nextInt();
		int m = sc.nextInt();
		int x=sc.nextInt();
		for(int i=0;i<x;i++) {
			h.add(sc.nextInt());
		}
		int y = sc.nextInt();
		for(int i=0;i<y;i++) {
			v.add(sc.nextInt());
		}
		long ans = largestHole(n,m,h,v);
		System.out.println(ans);
		

	}

}
