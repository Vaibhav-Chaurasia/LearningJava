package Java0024CollectionListAndHashes;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetExample {
	public static void main(String[] args) {  
		Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  

		// Traversing elements  
		Iterator<days> iter = set.iterator();  
		while (iter.hasNext())  
			System.out.println(iter.next());


		//Using allOf() function
		Set<days> set1 = EnumSet.allOf(days.class);  
		System.out.println("Week Days:" + set1);


		//Using noneOf() function
		Set<days> set2 = EnumSet.noneOf(days.class);  
		System.out.println("Week Days:" + set2); 
	}
}

enum days {  
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}  