
public class Main
{
	public static void main(String[] args) {
		Linked l=new Linked();
		l.insert(4);
		l.insert(3);
		l.insert(5);
		l.insert(6);
		l.display();
		System.out.println();
		System.out.print(l.size());
		l.delete(2);
		System.out.println();
		l.display();
			System.out.println();
		l.insertAtpoint(2,7);
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
        
        int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void delete(int idk){
            Node temp=head;
            for(int i=1;i<idk-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        void insertAtpoint(int idk,int data){
             Node s=new Node(data);
            Node temp=head;
            for(int i=1;i<idk-1;i++){
                temp=temp.next;
            }
            s.next=temp.next;
            temp.next=s;
        }
}