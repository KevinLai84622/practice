package selectSort;

import java.util.Arrays;

class DataWrap implements Comparable<DataWrap>{
	int data;
	String flag;
	
	public DataWrap(int data, String flag) {
		super();
		this.data = data;
		this.flag = flag;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return data + flag;
	}

	@Override
	public int compareTo(DataWrap o) {
		return this.data>o.data? 1:(this.data==o.data? 0:-1);
	}
	
}

public class selectSrot {
	public static void main(String[] args) {
		DataWrap[] data = new DataWrap[] {
				new DataWrap(21, ""),
				new DataWrap(30, ""),
				new DataWrap(49, ""),
				new DataWrap(30, "*"),
				new DataWrap(16, ""),
				new DataWrap(9, ""),
				new DataWrap(20, "")
		};
		System.out.println("排序之前:\n" + Arrays.toString(data));
		selectSort(data);
		System.out.println("排序之後:\n" + Arrays.toString(data));
	}
	// 選擇排序的方法
	public static void selectSort(DataWrap[] data) {
		System.out.println("開始排序:");
		int arraylength = data.length;		
		for(int i=0; i<arraylength-1; i++) {		// 依次進行n-1次比較，第i次比較將第i大的直選出來放在i位置上			
			for(int j=i+1; j<arraylength; j++) {	// 第i個資料只需與它後面的比較
				if(data[i].compareTo(data[j])>0) { 	// 如果第i位置的資料>j位置的資料 交換位置
					DataWrap tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
			}
			System.out.println("第" + (i+1) + "次比較:\t" + Arrays.toString(data));
		}
	}
	
}
