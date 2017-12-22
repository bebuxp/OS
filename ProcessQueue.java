
package queue;

import objects.Process;

public abstract class ProcessQueue extends Queue{
    
    @Override 
    public abstract void enqueue(Queue item);
    
    
    @Override
    public abstract Queue dequeue();
    
    
    @Override
    public abstract Queue peek();

}
