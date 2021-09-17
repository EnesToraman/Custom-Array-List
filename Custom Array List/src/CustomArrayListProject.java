import java.util.List;

public class CustomArrayListProject {

	public static void main(String[] args) {
		
		List<Long> list = new CustomArrayList<Long>();
		
		List<Long> list2 = new CustomArrayList<Long>();

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


		list2.addAll(list);

		list2.clear();
			
	}

}
