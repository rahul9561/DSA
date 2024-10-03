
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
		
		Stack s=new Stack(5);
		s.insert(5);
		s.insert(4);
		s.insert(3);
		s.display();
		s.pop();
		s.display();
	}
}


class Stack{
    int arr[];
    int rear,first,cap;
    
    Stack(int c){
        rear=-1;
        first=0;
        cap=c;
        arr=new int[cap];
    }
    
    void insert(int val){
        if(cap-1==rear){
            System.out.println("Stack full");
        }
        arr[++rear]=val;
    }
    void display(){
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }
    int pop(){
        System.out.println(arr[rear]);
        
        return rear--;
    }
}