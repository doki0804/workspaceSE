package nogeneric;

public class MyArrayList {
	
	private Object[] elementData;
	private int size;
	
	public MyArrayList() {
		size = 0;
		elementData= new Object[10];
		
	}
	
	public int size() {
		return size;
	}

	public void add(Object element) {
		elementData[size] = element;
		size++;
	}
	
	public Object get(int index) {
		return elementData[index];
	}
	
	public Object remove(int index) {
		Object removeElement = elementData[index];
		elementData[index]=null;
		size--;
		return removeElement;
	}
	
}
