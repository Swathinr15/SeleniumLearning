package assignments.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
        List<Integer> list = new ArrayList<Integer>();
         for(int i=0;i<data.length;i++) {
	       list.add(data[i]);
        }
         Collections.sort(list);
         Integer secLargest = list.get(list.size()-2);
         System.out.println("Second Largest element is "+secLargest);

	}

}
