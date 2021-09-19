import java.util.List;

public class CustomArrayListProject {

	public static void main(String[] args) {
		
		List<Long> list = new CustomArrayList<Long>();
		
		List<Long> list2 = new CustomArrayList<Long>();
		
		List<Long> proList = new ProCustomArrayList<Long>();
		
		List<Long> proList2 = new ProCustomArrayList<Long>();

		list.add(7L);
		list.add(2L);
		list.add(12L);
		list.add(2L);
		list.add(2L);
							
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

		// list2.addAll(list);

		// list2.clear();
		
		proList.add(3L);
		proList.add(1L);

		proList.add(4L);
		
		proList2.add(10L);
		proList2.add(20L);
		proList2.add(30L);
		
		proList.clear();
		
		proList.addAll(proList2);
		
		proList.clear();
			
	}

}
