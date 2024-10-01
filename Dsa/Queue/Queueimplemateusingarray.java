
public class Main
{
	public static void main(String[] args) {
		Queue l=new Queue(4);
		l.insert(5);
		l.insert(6);
		l.insert(7);
		l.insert(9);
		l.display();
		l.delete();
		System.out.println();
		l.display();
	}
}


class Queue{
    int arr[];
    int rear,first,capcity;
    
    Queue(int c){
        this.rear=-1;
        this.first=0;
        this.capcity=c;
        arr = new int[capcity];
    }
    
    void insert(int data){
         if(capcity-1 == rear){
            System.out.print("Queue is full");
        }
        
        arr[++rear]=data;
    }
    
    void display(){
        if(first > rear){
            System.out.print("Queue is empty");
        }
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
     void delete(){
        if(first > rear){
            System.out.print("Queue is empty");
        }
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
    }
    
    
}