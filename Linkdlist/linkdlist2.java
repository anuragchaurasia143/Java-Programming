package Linkdlist;

class Node{
    int data;
    Node next;
    Node (int data){
        this.data= data;
        this.next = null;
    }
}


    
public class linkdlist2 {

    static void traverse (Node head){
        Node current = head ;
        while(current!= null){
            System.out.print(current.data +"->");
            current = current.next;
        }
        System.out.println("null");
    }

    static Node InsertAtBegining(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;

    }
        static Node InsertAtEnding (int data, Node head ){
      Node newNode = new Node(data);
      if (head == null){
        return newNode;
            }

    Node temp = head;
    while (temp.next != null){
        temp = temp.next;

      }
      temp.next = newNode;
      return head;

      
    }
         static Node InsertAtPostion(Node head , int data , int pos){
            
             if (pos == 1){
                 return InsertAtBegining(head, data);
             }

       Node temp = head ;
             Node newNode = new Node(data);

       for (int i=1; i<pos-1; i++){
        temp = temp.next;
       }

       newNode.next = temp.next;
       temp.next = newNode;
       return head;

       

    }

   

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
       // traverse(head);
        head = InsertAtBegining(head, 5);
       // traverse(head);
       head = InsertAtEnding(50, head);
        traverse(head);

    
    }
}
