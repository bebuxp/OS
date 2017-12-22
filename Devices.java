
package resources;

/**
 *
 * @author Ebtehal 
 */

public class Devices {

    // initially create all variables needed in (set & get) methods. based on Output File.
    private int size;
    private int free_Devices;
    
    /**
     * Devices object constructor.
     */
   
    public Devices(int size) {
        
        //initial.
        this.size = size;
        this.free_Devices = 0;
    }
    
   //---------------------------------------------------------
   //METHODS..
   //---------------------------------------------------------
    
    
    /**
     * taken: for the devices is using by job will subtracted from the total free devices.
    */
    public void remainDevices(int taken){       
        this.free_Devices= this.free_Devices - taken;
    }
    
 //--------------------------------------------------------------------------
    
    /**
     * release: for the devices is finish of using by job (job is terminated) will summation to total free devices
    */
    public void ReleaseDevices(int release){
        this.free_Devices= this.free_Devices + release;
    }
    
//---------------------------------------------------------------------------
    
   //-----------------
   //GETTING METHODS..
   //-----------------
    
    
    /**
     * return the size of devices.
    */
    
    public int getSize() {
        return size;
    }
    
//---------------------------------------------------------------
    
    /**
     * return number of free devices
    */
    
    public int getFreeDevices() {
        return free_Devices;
    }
    
}
