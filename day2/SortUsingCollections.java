package assignments.week3.day2;


import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;


public class SortUsingCollections {

	public static void main(String[] args) {
		System.out.println("printing names in Reverse Order using TreeSet: ");

		// TODO Auto-generated method stub
		String[] company = { "Aspire Systems", "CTS", "HCL", "Wipro" };
		TreeSet<String> cmpnyList = new TreeSet<String>(Arrays.asList(company));
		int size1 = cmpnyList.size();
		System.out.println("The size is "+size1);
		NavigableSet<String> reverseOrder = cmpnyList.descendingSet();
		for (String set : reverseOrder) {
			System.out.println(set);
		}

		System.out.println("printing names in Reverse Order using List: ");
        String[] cmpny = { "Aspire Systems", "CTS", "HCL", "Wipro" };
		List<String> cmpnyLst = new ArrayList<String>(Arrays.asList(cmpny));
		int size2 = cmpnyLst.size();
		System.out.println("The size is "+size2);
		Collections.reverse(cmpnyLst);
		for (String list : cmpnyLst) {
			System.out.println(list);

		}
	}
}
