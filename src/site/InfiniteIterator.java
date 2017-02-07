package site;

import java.util.Collection;
import java.util.Iterator;

public class InfiniteIterator <T> implements Iterator{
	
	private Collection<T> c;
	private Iterator<T> currentIterator;
	//private Object currentIterator;

	
	
	public InfiniteIterator(Collection<T> c){
		this.c = c;
		this.currentIterator = c.iterator();;
	}

	@Override
	public boolean hasNext(){
		return !c.isEmpty();
	}
	@Override
	public T next(){
		if(!currentIterator.hasNext()){
			currentIterator = c.iterator();
		}
			return currentIterator.next();
	}
}
