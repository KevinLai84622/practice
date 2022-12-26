package nineNineTable;

import java.util.Scanner;

public class stepped_nineNineTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入列數: ");
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++) {		// 外迴圈控制列數
			for(int j=1; j<=i; j++) {	// 內迴圈控制每列運算是個數
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}

	}

}
