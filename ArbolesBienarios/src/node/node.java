package node;

import java.util.Iterator;

public class node<T> implements Comparable<T> {
	private T value = null;
	private node<T> left = null;
	private node<T> right = null;
	private long index = 0;

	public node() {// constructor
		this.value = null;
	}
	public node(T value){
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public node<T> getLeft() {
		return left;
	}

	public void setLeft(node<T> left) {
		this.left = left;
	}

	public node<T> getRight() {
		return right;
	}

	public void setRight(node<T> right) {
		this.right = right;
	}

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	@Override
	public String toString() {

		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}

	@Override
	public int compareTo(T o) {

		return 0;
	}

}
