
package queue;

import objects.Process;

public abstract class ProcessQueue extends Queue{
    
    
/**
 *
 * @author Rahaf Albogami
 */
    
    @Override 
    public abstract void enqueue(Process item);
    
    
    @Override
    public abstract Process dequeue();
    
    
    @Override
    public abstract Process peek();

}
