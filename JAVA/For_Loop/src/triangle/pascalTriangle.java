package triangle;

import java.util.Scanner;

public class pascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入列數: ");
		int row = sc.nextInt();
		
		int[][] ary = getTriangle(row);
		printTriangle(ary);
	}
	
	// 得到巴斯卡三角的方法
	private static int[][] getTriangle(int row){
		int[][] ary = new int[row][row];
		
		for(int i=0; i<ary.length; i++) {	// 直邊,斜邊設定為1
			ary[i][0]=1;
			ary[i][i]=1;
		}
		
		for(int i=1; i<ary.length; i++) {	// 外迴圈控制列數
			for(int j=1; j<=i; j++) {		// 內迴圈控制行數
				ary[i][j] = ary[i-1][j-1] + ary[i-1][j]; // 目前位置等於 左上方與正上方的和
			}
		}
		return ary;
	}
	
	// 列印巴斯卡三角
	private static void printTriangle(int[][] ary) {
		for(int i=0; i<ary.length; i++) {	// 外迴圈控制列數
			for(int j=0; j<=i; j++) {		// 內迴圈控制行數
				System.out.print("[" + ary[i][j] + "]");
			}
			System.out.println();
		}
	}
	
}
