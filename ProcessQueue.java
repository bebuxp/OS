
package queue;

import objects.Process;

public abstract class ProcessQueue extends queue{
    
    
/**
 *
 * @author Rahaf Albogami
 */
    
    public abstract void enqueue(Process item);
    
    
    @Override
    public abstract Process dequeue();
    
    
    @Override
    public abstract Process peek();

}
