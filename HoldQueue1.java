package queue;

import objects.Job;
import java.util.*;

public class HoldQueue1 extends JobQueue {

    public HoldQueue1() { //create a queue "hold queue #1"
        queue = new LinkedList<Job>(); //implemented with linkedList
    }
    
    @Override //return the first Job in the queue "the method in queue.class"
    public Job peek() {
        return (Job) queue.peek(); //return the head (the first Job in the queue)
    }

    @Override //for insert a new Job "the method in queue.class"
    public void enqueue(Job newJob) {
        if (queue.isEmpty()) { //if queue is empty
            queue.add(newJob); //insert new Job to the queue
      } else { //if queue is not empty
            LinkedList<Job> temporary = new LinkedList<Job>(); //temporary linkedList for checking
            Job firstJob = new Job(); //for first Job in queue
            while (!queue.isEmpty()) { //if queue not empty
                firstJob = (Job) queue.remove(); //delete the first Job in queue at save it in firstJob
                if (newJob.getBurstTime() < firstJob.getBurstTime()) { //if the new job has burst time < first Job
                    temporary.insert(newJob); //insert the new Job to the temporary linkedList
                    newJob = firstJob; //save firstJob in newJob
                    continue; //discard the rest command and restart again till visitig the whole queue
                }
                temporary.add(firstJob); //if the burst time of the firstJob is > burst time of the new job, insert the firstJob into temporary linkedList
            }
            temporary.add(newJob); //if temporary is empty, insert new Job
            queue = temporary; //save the temporary in queue
        }
    }

    @Override //for delete an exsiting Job "the method in queue.class"
    public Job dequeue() {
        if (!queue.isEmpty()) //if queue is not empty
        {
            return (Job) queue.remove(); //return the first Job
        }
            return null; //else return null
    }
}
