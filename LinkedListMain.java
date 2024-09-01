class LinkedList{
    class Node{
        int data;
        Node link;
    }
    Node head=null;
    void addNum(int m){
        //System.out.println("hi");        
        Node newNode=new Node();
        newNode.data=m;
        newNode.link=null;
        if(head==null){
         //   System.out.println("head is null");
           
            head=newNode;            
         //   System.out.println("head="+head);     
        }
        else{
          //  System.out.println("head Not null");
            Node current=head;
            while(current.link!=null){
                current=current.link;
            }
            current.link=newNode;
        }
      //  System.out.println("new node="+newNode);
      //  System.out.println(newNode.data);
    }
    void numsPrint(LinkedList nums){
        Node current=head;      
         while (current!=null) {
            
           // System.out.println("Printing current="+current);
           //printing links is not required,did it for sake of understanding
           //Println goes to newline by default, so print is used as
           // we wanted it to be in same line
           System.out.print("["+current.data+" "+current.link+"]");
           System.out.print(" ");
            current=current.link;
           // System.out.println(current.link);
        }
    }
}
public class LinkedListMain {
    public static void main(String args[]){
        LinkedList nums=new LinkedList();
        nums.addNum(3);
        nums.addNum(5);
        nums.addNum(10);
        nums.numsPrint(nums);
    }
}

/* Output:
 java LinkedListMain
 [3 LinkedList$Node@659e0bfd] [5 LinkedList$Node@2a139a55] [10 null]
 */

