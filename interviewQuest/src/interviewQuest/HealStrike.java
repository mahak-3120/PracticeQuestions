package interviewQuest;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Vova is again playing some computer game, now an RPG. In the game Vova's character received a quest: to slay the fearsome monster called Modcrab.

After two hours of playing the game Vova has tracked the monster and analyzed its tactics. The Modcrab has h2 health points and an attack power of a2. Knowing that, Vova has decided to buy a lot of strong healing potions and to prepare for battle.

Vova's character has h1 health points and an attack power of a1. Also he has a large supply of healing potions, each of which increases his current amount of health points by c1 when Vova drinks a potion. All potions are identical to each other. It is guaranteed that c1 > a2.

The battle consists of multiple phases. In the beginning of each phase, Vova can either attack the monster (thus reducing its health by a1) or drink a healing potion (it increases Vova's health by c1; Vova's health can exceed h1). Then, if the battle is not over yet, the Modcrab attacks Vova, reducing his health by a2. The battle ends when Vova's (or Modcrab's) health drops to 0 or lower. It is possible that the battle ends in a middle of a phase after Vova's attack.

Of course, Vova wants to win the fight. But also he wants to do it as fast as possible. So he wants to make up a strategy that will allow him to win the fight after the minimum possible number of phases.

Help Vova to make up a strategy! You may assume that Vova never runs out of healing potions, and that he can always win.

Input

The first line contains three integers h1, a1, c1 (1 ≤ h1, a1 ≤ 100, 2 ≤ c1 ≤ 100) — Vova's health, Vova's attack power and the healing power of a potion.

The second line contains two integers h2, a2 (1 ≤ h2 ≤ 100, 1 ≤ a2 < c1) — the Modcrab's health and his attack power.

Output

In the first line print one integer n denoting the minimum number of phases required to win the battle.

Then print n lines. i-th line must be equal to HEAL if Vova drinks a potion in i-th phase, or STRIKE if he attacks the Modcrab.

The strategy must be valid: Vova's character must not be defeated before slaying the Modcrab, and the monster's health must be 0 or lower after Vova's last action.

If there are multiple optimal solutions, print any of them

Examples

Input

10 6 100
17 5
Output

4
STRIKE
HEAL
STRIKE
STRIKE
Input

11 6 100
12 5
 

Output

2
STRIKE
STRIKE
  */

public class HealStrike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int a1 = sc.nextInt();
		int c1 = sc.nextInt();
		int h2 = sc.nextInt();
		int a2 = sc.nextInt();
		ArrayList<String> res = new ArrayList<>();
		while(h2>0) {
//			1st vova turn
//			if vova's health is less than monster's attack
			if(h1 <= a2) {
//				if we can kill earlier
				if(h2<=a1) {
					h2-=a1;
					res.add("STRIKE");
					break;
				}
				else {
//					we'll heal vova
					h1+=c1;
					res.add("HEAL");
				}
			}
			else {
				h2 -= a1;
				res.add("STRIKE");
			}
//			monster turn
			h1 -= a2;
			
		}
		System.out.println(res.size());
		for(String x : res) {
			System.out.println(x);
		}

	}

}
