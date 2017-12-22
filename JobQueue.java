package queue;
import objects.Job;

/**
 *
 * @author Waad
 */

public abstract class JobQueue extends queue{    

    public abstract void enqueue(Job item);

    @Override
    public abstract Job dequeue();

    @Override
    public abstract Job peek(); 
}
