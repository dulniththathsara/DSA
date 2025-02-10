/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boundedstack;

/**
 *
 * @author Dulnith
 */
public class stackApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BoundedArrayStack theStack = new BoundedArrayStack(5);//create a stack with max size
        
        //push operation
        for(int i = 1; i <= 5; i++){
            if(!theStack.isFull()){
                //insert items
                theStack.push(i * 10);
            }else{
                System.out.println("Cannot push.Stack is full");
            }            
        }
        theStack.print();
        
        //peek the top element
        if(!theStack.isEmpty()){
            System.out.println("\nTop element is: "+ theStack.peek());
        } else{
            System.out.println("Stack is emty, nothing to peek");
        }
        
        //pop operation
        if(!theStack.isEmpty()){
            while(!theStack.isEmpty()){
                //until the stack is empty,delete items from stack
                int val = theStack.pop();
                System.out.print(val);
                System.out.print(" ");
            }
        }else{
            System.out.println("Cannot pop. Stack is empty");
        }
    }
    
}
