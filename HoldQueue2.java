
package queue;

import java.util.LinkedList;
import objects.Job;


/**

 * @author Ebtehal

 */

public class HoldQueue2 extends JobQueue {

     /**
     * Hold Queue #2 object constructor based on FCFS algorithm.
     */

    public HoldQueue2 (){

      //creation queue baesd on linkedlist
       queue =  new LinkedList<Job>();

    }
  
  //-------------------------------------------
  
  /**
     * Insert element at rear in Queue 
*/
  
    @Override
    public void enqueue(Job job) {
        queue.addLast(job);
    }
//----------------------------------------------
  
  /**
        * Removes elements from front of Queue 
     */
    @Override
    public Job dequeue() {

       Job head ; //var for set the first job after delete.
      if(!queue.isEmpty())
      { 
            head = (Job) queue.removeFirst();
       return head ; 
      }
	  else 
		  return null; 

    } 

  //--------------------------------------------------
  
   /**
         * peek method used to retrieve the head of queue without remove it.
    */
  
  @Override
    public Job peek() {

        return (Job)queue.peek();

    }

}
