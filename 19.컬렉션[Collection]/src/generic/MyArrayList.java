package generic;

public class MyArrayList<E> {
	
	private Object[] elementData;
	private int size;
	
	public MyArrayList() {
		size = 0;
		elementData= new Object[10];
		
	}
	
	public int size() {
		return size;
	}

	public void add(E element) {
		elementData[size] = element;
		size++;
	}
	
	public E get(int index) {
		return (E)elementData[index];
	}
	
	public E remove(int index) {
		E removeElement = (E)elementData[index];
		elementData[index]=null;
		size--;
		return removeElement;
	}
	
}
