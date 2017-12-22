package queue;

import java.util.LinkedList;


/**
 * @author Ebtehal
 *
 */

public abstract class queue  { 
    LinkedList queue; // creation of queue based on Linked List
	
    public queue(){}
    
//METHODS
//-------------------------		
   /*check if queue have elements*/
  public boolean isQueueEmpty(){
  	return queue.isEmpty();    // (replace by correct call)
   }
  
//------------------------------
    /*Insert element at rear in Queue*/
    public  void enqueue(Object object){
        queue.addLast(object);
   }
	
//-------------------------------
    /*Removes elements from front of Queue*/
     public Object dequeue(){
        if(!queue.isEmpty())
            return (Object) queue.removeFirst();
        else 
            return null; 
    }
	
//------------------------------
    /* peek method used to retrieve the head of queue without remove it*/
	public abstract Object peek();
	
//------------------------------
    /*Return the size of queue.*/
        public int get_size(){
            return queue.size();
       }
}
