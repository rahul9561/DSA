
public class Main
{
	public static void main(String[] args) {
		Linked l=new Linked();
		l.insert(4);
		l.insert(3);
		l.insert(5);
		l.insert(6);
		l.display();
	}
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Linked{
    Node head;
    void insert(int data){
        Node s=new Node(data);
        if(head==null){
            s.next=head;
            head=s;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            s.next=temp.next;
            temp.next=s;
        }
    }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
}