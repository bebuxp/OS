
package queue;

import java.util.LinkedList;


public abstract class Queue  {

  // specify object data and property fields
	
     LinkList queue ;  

	
public Queue()
    {
        queue=new LinkList();
    }



// -----------------------------------------------------------------------
// method functions used by Queue() object
//

// specify (i.e., design) interfaces details (arguments and return values)

// --------------------
// implement queue empty condition based on linked list .isEmpty() method

public boolean isQueueEmpty()              // note "q" prefix to distinguish from similar 
                               // function in linked-list package
{
	 return Queue.isEmpty();               // (replace by correct call)
}
  

// --------------------
public <T> void enqueue( T item)
{
  Queue.insert(item);
}

// --------------------

  public T dequeue()
{

   if(!queue.isEmpty())
            queue.deleteFirst();
	
}
  
}
