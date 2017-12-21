
package queue;

import java.util.LinkedList;


public abstract class Queue  {

  LinkedList queue = new LinkedList();  // creation of queue based on Linked List

	
public Queue()
    {
        queue=new LinkList();
    }

/**
   * check if queue have elements
*/	

public boolean isQueueEmpty()        
// note "q" prefix to distinguish from similar  
{
	 return Queue.isEmpty();               // (replace by correct call)
}
  

// --------------------
	
/**
     * Insert element at rear in Queue
*/
public  void enqueue( int item)
{
  queue.insert(item);
}
	
// --------------------

/**
     * Removes elements from front of Queue 
     */
  public int dequeue()throws QueueEmptyException {
           try{
          if(!queue.isEmpty())
            queue.deleteFirst();
           }catch(LinkedListEmptyException llee){
                  throw new QueueEmptyException();
           }
    }
  
}
