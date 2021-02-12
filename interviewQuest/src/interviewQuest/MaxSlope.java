/**
 * 
 */
package interviewQuest;

/**
 * @author Mahak
 * 
 * Maroof is visiting a new city. Being a Mathematician, he does not like to visit different places but visit places differently. 
 * The city has N places to visit. We are given the (X,Y) co-ordinates of the places to visit. Maroof wants to start from a random place
 *  i and want to go to a random place j. But he involved a little maths in his procedure. Following are his demands:

	He will give a number A. Now, the place i and place j should be such that the line connecting these two points must have the Ath maximum 
	slope (There are total N*(N-1)/2 possible slopes among all the unordered places pairs).
	
	Input arguments to your function:
	
	Integer A
	
	B : An integer array containing X-coordinates of the places
	
	C : An integer array containing Y-coordinates of the places
	
	Note that the length of B (= N) will be equal to the length of C and the ith point is represented by (B[i], C[i]).
	
	Output: An array having exactly 2 elements : numerator and denominator of the slope (fraction should not be further reducible).
	
	Additional instructions:
	
	Places can be overlapping (Two places can have same (X,Y) co-ordinates)
	
	Overlapping places must not be considered as same places.
	
	In case the line joining the places is vertical, slope is -INF.
	
	Two overlapping places have slope -INF.
	
	Constraints:
	
	1 <= A <= 70
	
	1 <= N <= 100,000
	
	-10^9 <= B[i], C[i] <= 10^9 (Also X and Y coordinates can only be Integers)
	
	Example:
	
	Input: A = 2
	
	B = [1, 2, 3, 1, 2] //X coordinates of the places
	
	C = [2, 4, 6, 2, 3] //Y coordinates of the places
	
	Output:
	
	ans = [2,1].
	
	Sorted Points = [(1,2), (1,2), (2,4),(2,3),(3,6)]
	
	SortedSlopes: [3, 2, 2, 2, 2, 2, 1 , 1, -INF, -INF]
	
	Output instructions:
	
	Output fraction should not be further reducible [e.g. Reduce (6,4) to (3,2) before returning the answer]
	
	In case the answer is negative infinity, return (-1,0)
	
	In case the answer is zero, return (0,1)
	
	In case the answer is negative, numerator must be negative. [e.g.: (-3,2) not (3,-2) ]
 *
 */
public class MaxSlope {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
