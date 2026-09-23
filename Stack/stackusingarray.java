package Stack;

class stack{
    int arr[] ;
    int top;

    stack(int size){
        arr = new int[size];
        top=-1;

    }
     void  push(int x){
        if (top ==arr.length-1){
            System.out.println("stack overflow");
            return ;
        }
        top++;
        arr[top ]= x;
    }
    int  pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return -1;
        }
        return arr[top--];
    }
    int peek(){
        if(top==-1){
            return -1;
        }
        return arr[top];
    }

     boolean isEmpty(){
        return top==-1;
    }
    void display(){
        if(top==-1){
            System.out.println("syack is empty");
            return;
        }
        for(int i = top; i >=0; i--){
            System.out.println(arr[i]);
        }
    }
}


public class stackusingarray {
    public static void main(String[] args) {
        stack s = new stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.display();

    }
}
