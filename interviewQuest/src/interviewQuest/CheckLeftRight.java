package interviewQuest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 * Tools are there in a milling machine with duplicates, given a start index, find the minimum moves to find a given target tool
 * if we can move both left and right and after the last element the first one arrives.
 */


public class CheckLeftRight {
	static int checkLeft(List<String> list, int startIdx, String target) {
		int ptr = -1;
		int move =1;
		if(startIdx == 0) {
			ptr = list.size()-1;
		}
		else {
			ptr = startIdx-1;
		}
		if(list.get(startIdx).equals(target))
			return 0;
		while(ptr!=startIdx) {
			if(list.get(ptr).equals(target))
				break;
			ptr--;
			if(ptr < 0 )
				ptr=list.size()-1;
			move++;
			
		}
		return move;	
		
	}
	static int checkRight(List<String> list, int startIdx, String target) {
		int ptr = -1;
		int move =1;
		if(startIdx == list.size()-1) {
			ptr = 0;
		}
		else {
			ptr = startIdx+1;
		}
		if(list.get(startIdx).equals(target))
			return 0;
		while(ptr!=startIdx) {
			if(list.get(ptr).equals(target))
				break;
			ptr++;
			if(ptr > list.size()-1)
				ptr=0;
			move++;
			
		}
		return move;	
		
	}
	static int checkMin(List<String> tools, int startIndex, String target) {
//		int first_idx = tools.indexOf(target);
//		int last_idx = tools.lastIndexOf(target);
		
//		check left
		int left = checkLeft(tools, startIndex, target);
		int right = checkRight(tools, startIndex, target);
		return Math.min(left, right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine().trim());
			String[] s_arr = br.readLine().split(" ");
			List<String> input = new ArrayList<>();
			for(String s: s_arr) {
				input.add(s);
			}
			int startIdx = Integer.parseInt(br.readLine().trim());
			String target = br.readLine().trim();
			int ans = checkMin(input,startIdx, target);
			System.out.println(ans);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
