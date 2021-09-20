import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomArrayList<E> implements List<E>{

	private Object[] array;
	
	private int size;
	
	public CustomArrayList() {
		this.array = new Object[100];
		this.size = 0;
	}
	
	public Object[] getArray() {
		return array;
	}

	public void setArray(Object[] array) {
		this.array = array;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {
		for(int i = 0 ; i < this.size ; i++) {
			if (o.equals(array[i])) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		this.array[this.size] = e;
		this.size += 1;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		
		int a = -1;
		
		for (int i = 0 ; i < this.size ; i++) {
			if(array[i] == o) {
				a = i;
				array[i] = null;
				size -= 1;
				break;
			}
		}
				
		for (int j = a; j < this.size ; j++) {
			array[j] = array[j + 1];
		}
		
		return true;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
				
		Object[] cArray = c.toArray();
		
		System.out.println(cArray[0]);
		
		for(int i = 0 ; i < c.size() ; i++) {{
				if(!contains(cArray[i])) {
					return false;
				}
			}
		}
		
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {

		Object[] cArray = c.toArray();
		
		for(int i = 0 ; i < c.size() ; i++) {
			this.array[this.size] = cArray[i];
			this.size += 1;
		}
		
		return true;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
			
		this.size = 0;
		
		return true;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return true;
	}

	public void sysOut() {
				
		System.out.println("---");
		for (int i = 0 ; i < this.size ; i++) {
			System.out.println(this.array[i]);
		}
		
		System.out.println("--");
	}

	@Override
	public E get(int index) {
		
		return (E) this.array[index];
	}

	@Override
	public E set(int index, E element) {
		
		this.array[index] = element;
		
		return null;
	}

	@Override
	public void add(int index, E element) {
		
		for(int i = this.size ; i > index ; i--) {
			array[i] = array[i - 1];
		}
		
		this.size  += 1;
		array[index] = element;
		
	}

	@Override
	public E remove(int index) {
		
		for(int i = index ; i < this.size ; i++) {
			array[i] = array[i + 1];
		}

		size -= 1;
		
		return null;
	}

	@Override
	public int indexOf(Object o) {
		
		for(int i = 0 ; i < this.size ; i++) {
			if(array[i] == o) {
				return i;
			}
		}
		
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		
		for(int i = this.size - 1 ; i > -1 ; i--) {
			if(array[i] == o) {
				return i;
			}
		}
		
		return -1;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		this.size = 0;
	}


}
