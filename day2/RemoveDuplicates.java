package assignments.week2.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count;
		String str = "";
		String[] strArr = text.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				count = 1;		
				if (strArr[i].equals(strArr[j])) {
					count++;
				}
				if (count > 1) {
					strArr[j] = "";
					}
				}
		 }
		for (int k = 0; k < strArr.length; k++) {
			str+= " "+strArr[k];
        }
		System.out.println(str);
	}

}
