package nineNineTable;

import java.util.Scanner;

public class nineNineTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入列數: ");
		int row = sc.nextInt(); 
		System.out.print("請輸入行數: ");
		int column = sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=column; j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
}
