package objects;
//import resources.*;

/**
 *
 * @author Waad Muhammednour
 */

public class Job implements Comparable<Job>{ //comparble for sort Job directly
    
    //Datafield
    private int arrivedTime;
    private int currentTime;
    private int priority;
    private int memorySize;
    private int devicesNumber;
    private int burstTime;
    private int ID;
    
    //Constructures
    public Job() { //without parameters
    }
    public Job(int arrivedTime, int currentTime, int priority, int memorySize, int devicesNumber, int burstTime, int ID) { //with parameters
        this.arrivedTime = arrivedTime;
        this.currentTime = currentTime;
        this.priority = priority;
        this.memorySize = memorySize;
        this.devicesNumber = devicesNumber;
        this.burstTime = burstTime;
        this.ID = ID;
    }
    
    //Methods
    
    //Setter Methods
    
    public void setArrivedTime(int arrivedTime) {
        this.arrivedTime = arrivedTime;
    }
    
    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }
    
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
    
    public void setDevicesNumber(int devicesNumber) {
        this.devicesNumber = devicesNumber;
    }
    
    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    //Getter Methods
    
    public int getArrivedTime() {
        return arrivedTime;
    }
    
    public int getCurrentTime() {
        return currentTime;
    }
    
    public int getPriority() {
        return priority;
    }
    
    public int getMemorySize() {
        return memorySize;
    }
    
    public int getDevicesNumber() {
        return devicesNumber;
    }
    
    public int getBurstTime() {
        return burstTime;
    }
    
    public int getID() {
        return ID;
    }
    
    @Override
    public int compareTo(Job job) {
        return this.ID - job.ID; //ascending order
    }
}
