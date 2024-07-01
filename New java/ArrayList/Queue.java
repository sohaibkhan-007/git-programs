public class Queue{
	public static void main(String[] args) {
		Queue1 q=new Queue1();
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		System.out.println(q.pop());
		
	}
} 

class Queue1{
	private int front;
	private int rear;
	private int capacity;
	Object queue[];

	public Queue1(){

		front=-1;
		rear=-1;
		capacity=5;
		queue=new Object[capacity];
	}

		public void push(Object ob){
         if(front==capacity-1){
         	System.out.println("Queue is Empty.");
         }
         else{
         	if(front==rear)
         		++front;
         	queue[++rear]=ob;
         }
		}
		public Object pop(){
			 Object o=queue[front++];
			 return o;
		}
	}


