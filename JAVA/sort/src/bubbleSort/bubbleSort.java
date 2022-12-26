package bubbleSort;

import java.util.Arrays;

public class bubbleSort {
	public static void main(String[] args) {
		Integer data[] = {16, 9, 23, 21, 30, 49, 21, 30};
		System.out.println("排序之前:\n" + Arrays.toString(data));
		bubbleSort(data);
		System.out.println("排序之後:\n" + Arrays.toString(data));
	}
	
	public static void bubbleSort(Integer[] data) {
		System.out.println("開始排序:");
		int arraylength = data.length;
		for(int i=0; i<arraylength-1; i++) {
			boolean flag = false;
			for(int j=0; j<arraylength-1-i; j++) {
				if(data[j].compareTo(data[j+1])>0) {
					int tmp = data[j+1];
					data[j+1] = data[j];
					data[j] = tmp;
					flag = true;
				}
			}
			System.out.println(Arrays.toString(data));
			if(!flag) {
				break;
			}
		}
	}
}
