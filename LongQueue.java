
package queue;

import java.util.LinkedList;
import objects.Process;

/**
 *
 * @author sahar
 */
public class LongQueue extends ProcessQueue{
    
     public LongQueue (){
       queue =  new LinkedList<Process>();//creation queue baesd on linkedlist
    }

    @Override
    public void enqueue(Process newProc) {      
            queue.add(newProc);
     
    }

    @Override
    public Process dequeue() {
        if (!queue.isEmpty())
            return (Process)queue.remove();
        
        return null;
    }

    @Override
    public Process peek() {
        return (Process)queue.peek();   
    }
    
    public boolean isQueueEmpty(){
  	return queue.isEmpty();    
   }
}
