
package queue;

import java.util.LinkedList;
import objects.Job;


public abstract class Queue  {

  LinkedList queue queue=new LinkedList<Job>();  // creation of queue based on Linked List

	
//-------------------------	
//    METHODS OF QUEUE.
//-------------------------	
	
   /**
      * check if queue have elements
   */	

  public boolean isQueueEmpty()         
   {
  	return queue.isEmpty();    // (replace by correct call)
   }
  

// ------------------------------
	
    /**
       * Insert element at rear in Queue
    */
  public  void enqueue( Job job)
   {
        queue.insert(job);
   }
	
// -------------------------------

    /**
        * Removes elements from front of Queue 
     */
     public Job dequeue()
    {
          if(!queue.isEmpty())
            return (Job) queue.deleteFirst();
	  else 
		  return null; 
    }
	
//------------------------------
    /**
         * peek method used to retrieve the head ofqueue without remove it.
    */
  
	public abstract Object peek();
	
//-----------------------------------
	
        /**
	* retrun the size of queue.
	*/
	
       public int get_size()
       {
	  return queue.size();
       }
  	
}
