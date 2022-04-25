class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr=null;
    Integer next=null;
	public PeekingIterator(Iterator<Integer> iterator) {
	   itr=iterator;
        if(hasNext())
        next=itr.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
       return next; 
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	  Integer currVal=next;
      if(itr.hasNext())
          next=itr.next();
        else
            next=null;
        return currVal;
	}
	
	@Override
	public boolean hasNext() {
	   return next!=null || itr.hasNext();
	}
}