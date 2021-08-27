package assignments.week3.day2;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
//import java.util.Collections;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 ={3,2,11,4,6,7} ;
		int[] arr2 ={1,2,8,4,9,7};
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i : arr1) {
			list1.add(i);
		}
		System.out.println(list1);
		List<Integer> list2 = new ArrayList<Integer>();
		for(int j : arr2) {
			list2.add(j);
		}
		System.out.println(list2);

		list1.retainAll(list2);
		System.out.println(list1);
	}
}
