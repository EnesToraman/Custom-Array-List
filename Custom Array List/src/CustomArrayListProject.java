import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CustomArrayListProject {

	public static void main(String[] args) {
		
		List<Long> list = new CustomArrayList<Long>();
		
		List<Long> list2 = new CustomArrayList<Long>();
				
		List<Long> proList = new ProCustomArrayList<Long>();
				
		List<Long> collection = new ArrayList<Long>();
		
		List<Long> proList2 = new ProCustomArrayList<Long>();
		
		List<Long> proList3 = new ProCustomArrayList<Long>();
		
		list.add(7L);
		list.add(1L);
		list.add(4L);
		list.add(30L);
		list.add(2L);
		
		collection.add(30L);
		collection.add(2L);
		collection.add(4L);

		proList.add(3L);
		proList.add(1L);
		proList.add(4L);

		proList2.add(7L);
		
		// list.remove(7L);
		
		// System.out.println(list.size());
		
		// System.out.println(list.isEmpty());
		
		// System.out.println(list.contains(1L));
		
		// list.removeAll(list);
				
		// System.out.println(list.indexOf(12L));
		
		// System.out.println(list.lastIndexOf(2L));
		
		// System.out.println(list.get(2));

		// list.set(0, 70L);

		// list.add(2, 23L);

		// list.remove(1);
		
		// proList.addAll(collection);
		
		// list.addAll(collection);		
	
		// System.out.println(proList.containsAll(proList2));
		
		//System.out.println(list.containsAll(list2));		
		
		// System.out.println(list.containsAll(collection));
	}
	
}
