
package resources;

import objects.Process;


/**
 *
 * @author Ebtehal
 */

public class CPU
{
   // initially create all variables needed in (set & get) methods. based on Output File.
   
    private Process Process_run; // object of process.
    private int Quantum_time;     // compute the time of quantum.
    private boolean inProcessing;  // check for processing
    private boolean path;  //check path (is from long queue).
   
   
   /**
     * CPU object constructor.
     */

   public CPU() {
       Process_run = null;
        inProcessing = false;
    }
   
   //---------------------------------------------------------
   //METHODS..
   //---------------------------------------------------------
   
   
   /**
     * boolean returned: will check if process is start processing or not.
     */
   public boolean isProcessing() {
        return inProcessing;
    }
   
   //----------------------------------------
   
   
   //-----------------
   //SETING METHODS..
   //-----------------
   
   
   /**
     * set the state of process. (true or false).
     */
    public void setProcessing(boolean inP) {
        this.inProcessing = inP;
    }
   
   //-----------------------------------------
   
   /**
     * set the process that will start the running.
     */
   
   public void setProcessRun(Process P_run) {
        this.Process_run = p_run;
    }
   
//-----------------------------------------------
  
   /**
     * set the quantum time.
     */
   
   public void setQuantumTime(int QTime) {
        this.Quantum_time = QTime;
    }
   
//--------------------------------------------------  

   
   /**
     * set the path of process ( is from the long queue -> "True" , or not -> "False").
     */
   
   public void setProcessPath(boolean path) {
        this.path = path;
    }
   
//---------------------------------------------------
   
   //-----------------
   //GETTING METHODS..
   //-----------------
 
   
    /**
     * retrun the process it is run.
     */
    public Process getProcessRun() {
        return Process_run;
    }
 //-----------------------------------------------------
   
    /**
     * retrun quantum time.
     */
   public int getQuantumTime() {
        return Quantum_time;
    }
 //------------------------------------------------------
   
    /**
     * retrun true if process from long queue.
     */
   public boolean getProcessPath() {
        return path;
    }
}
