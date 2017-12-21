class LinkList
{
    private Node first;
    private Node last;
    public LinkList()
    {
        first=null;
        last=null;
    }
    public void insertLast(int x)
    {
        Node newNode=new Node(x);
        newNode.next=null;
        if(isEmpty())
            first=newNode;
        else
            last.next=newNode;
        last=newNode;
    }
    public int deleteFirst()
    {
        int t=first.data;
        if(first.next==null)
            last=null;
        first=first.next;
        return t;
    }
    public int peekFirst()
    {
        return(first.data);
    }
    public boolean isEmpty()
    {
        return(first==null);
    }
    public void displayList()
    {
        Node current=first;
        while(current!=null)
        {
            current.displayNode();
            current=current.next;
        }
    }
}