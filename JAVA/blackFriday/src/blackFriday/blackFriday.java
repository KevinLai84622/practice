package blackFriday;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class blackFriday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入起始年分: ");
		int startYear = sc.nextInt();
		System.out.print("請輸入打算輸出未來幾年: ");
		int years = sc.nextInt();
		getBlackFriday(startYear, years);
	}
	
	public static void getBlackFriday(int startYear, int years) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E");
		
		int i=0;
		Calendar cal = Calendar.getInstance();
		
		while(i<years) {
			for(int j=0; j<12; j++) {
				cal.set(startYear, j, 13);
				if(5 == (cal.get(Calendar.DAY_OF_WEEK)-1)) {
					System.out.println("黑色星期五: " + sdf.format(cal.getTime()));
				}
			}
			startYear++;
			i++;
		}
	}

}
