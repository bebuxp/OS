package queue;
import objects.Job;

/**
 *
 * @author Waad
 */

public abstract class JobQueue extends queue{    

    @Override
    public abstract void enqueue(Job job);

    @Override
    public abstract Job dequeue();

    @Override
    public abstract Job peek(); 
}
