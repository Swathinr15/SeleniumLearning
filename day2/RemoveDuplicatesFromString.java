package assignments.week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] word = text.split(" ");
		Set<String> strListArr = new LinkedHashSet<String>();
		Set<String> dupstrListArr = new LinkedHashSet<String>();
		for (int i = 0; i < word.length; i++) {
			if (strListArr.add(word[i]) == false) {

				dupstrListArr.add(word[i]);
			}
		}
		strListArr.removeAll(dupstrListArr);

		for (String itrateStrList : strListArr) {

			System.out.print(itrateStrList + " ");
		}

	}
}
