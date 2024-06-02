package JavaSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortIntegerListBasedOnItsLastDigit {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,3,40,31,44,32);
		List<Integer> list=sort(l);
		System.out.println(list);
	}

	private static List<Integer> sort(List<Integer> l) {
		
		Comparator<Integer> comp=new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				int lastDigit1=a%10;
				int lastDigit2=b%10;
				if(lastDigit1>lastDigit2) {
					return 1;
				}
				return -1;
			}

		};
		Collections.sort(l, comp);
		
		return l;
	}

}
