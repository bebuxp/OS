/**
 *Node class, which holds data and contains next which points to next Node.
 */
class Node {
    public int data; // data in Node.
    public Node next; // points to next Node in list.
 
    /**
     * Linked list node object constructor
     */
    public Node(int data){
           this.data = data;
    }



public class LinkList {
    
// Linked list object constructor
  
    
    public void LinkList()
    {
        this.first = null;   // list initially empty
        this.last = null ;
    }

        
// -----------------------------------------------------------------------
// method functions used by List() object
        
        
    public boolean isEmpty() {
       return (this.first == null);
    }// end method.
        
//----------------------------------------------------------------

    /**
     * Inserts new Node at last of LinkedList.
     */
    
    public void insert(int data) // can be the type of job??
    {
        
        // if list empty create node and insert, otherwise walk down list and insert at end.
       Node newNode = new Node(data);       //Creation of New Node.
           
           if(first==null){          //means LinkedList is empty, make first point to new Node.
                  first=newNode;    //first ---> newNode
                  return;
           }// end if (first == null)
           
        else{
           Node tempNode = first; // save reference to first Node in tempNode- so that we could return saved reference.
            
           while(tempNode.next!=null)
           { //Executes until we don't find last Node of LinkedList.
             //If next of some Node is pointing to null, that means it's a last Node.
              tempNode=tempNode.next; //move to next Node.
           }//end while loop.
            
           tempNode.next=newNode;  //make last's Node next point to new Node
        }// end else.
    } //end method INSERT.
        
//---------------------------------------------
        
   /**
     * Deletes first Node
     */     
public Node deleteFirst()
    {
           if(first==null)
           {  //means LinkedList in empty, throw exception.              
                  throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
           }
           Node tempNode = first; // save reference to first Node in tempNode- so that we could return saved reference.
           first = first.next; // delete first Node (make first point to second node)
           return tempNode; // return tempNode (i.e. deleted Node)
    }

    }
