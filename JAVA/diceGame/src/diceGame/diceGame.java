package diceGame;

import java.io.IOException;

/*
 * 玩家質兩個骰子，點數為1~6，如果第一次點數和為7或11，則玩家勝，如果點數和為2,3或12，則玩家輸，
 * 如果和為其他點數，則記錄第一次的點數和，然後繼續擲骰，直到點數和等於第一次擲出的點數和，則玩家勝，
 * 如果在這之前擲出了點數和為7，則玩家輸。
 */

public class diceGame {
	public static void main(String[] args) throws IOException{
		final int Win=0, Lost=1, Mid=2;
		boolean flag=true;
		int Outcome=Mid;
		int sum;
		int point=0;
		System.out.println("~~擲骰子遊戲，按Enter開始遊戲~~");
		
		while(true) {
			System.in.read();
			if(flag) {
				sum = getPoint();
				System.out.println("第一次玩家擲出的點數和: " + sum);
				switch(sum) {
					case 7:
					case 11:
						Outcome = Win;
						break;
					case 2:
					case 3:
					case 12:
						Outcome = Lost;
						break;
					default:
						flag = false;
						Outcome = Mid;
						point = sum;
						break;
				}		
			}else {
				sum = getPoint();
				System.out.println("\n第二次玩家擲出的點數和: " + sum);
				if(sum == point) {
					Outcome = Win;
				}else {
					Outcome = Lost;
				}
			}
			if(Outcome == Mid) {
				System.out.println("未分出勝負，在擲一次~~~");
			}else {
				if(Outcome == Win) {
					System.out.println("玩家贏~~");
				}else {
					System.out.println("玩家輸~~");
				}
				System.out.println("再玩一次?(輸入 n 結束)");
				if(System.in.read() == 'n') {
					System.out.println("遊戲結束~~~");
					break;
				}
				flag = true;
			}
		}
	}
	
	public static int getPoint() {
		int roll = ((int)(Math.random()*6) + (int)(Math.random()*6));
		if(roll<2) {
			roll=2;
		}
		return roll;
	}
}
