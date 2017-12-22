package queue;
import java.util.LinkedList;
import objects.Process; 

/**
 *
 * @author Shahad
 */

public abstract class CompleteQueue extends ProcessQueue {
        
    public CompleteQueue(){
        queue = new LinkedList<Process>();
    }
    
    @Override
    public void enqueue(Process item){
        if(!queue.contains((Object)item))     
            queue.addLast(item); //add the item at the end of the queue 
    }
    
    @Override
    public Process dequeue(){
        Process head = (Process)queue.removeFirst(); //remove the item at the the head of the queue 
        return head;
    }  
    
    @Override
    public Process peek(){
    return (Process)queue.peek(); //return the item in the head 
    }
}
