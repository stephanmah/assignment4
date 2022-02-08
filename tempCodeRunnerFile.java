// Java program to implement two stacks in a 
// single array 
class TwoWayStacks 
{ 
    int size; 
    int top1, top2; 
    int arr[]; 
  
    // Constructor 
    TwoWayStacks(int n) 
    { 
        arr = new int[n]; 
        size = n; 
        top1 = -1; 
        top2 = size; 
    } 
    
    boolean isFull(){
      if (top1 < top2 - 1)
      return false;
      else
       return true;
    }
    
    boolean isEmpty(){
      if((top1 == -1) && (top2 == size)){
      System.out.println(" Stack is empty");
      return true;
      }
      return false;
    }
  
    // Method to push an element x to stack1 
    void push_A(int x) { 
        if (isFull()) 
        { 
          System.out.println("Stack Overflow");  
        } 
        else
        { 
         top1++; 
            arr[top1] = x;
        } 
    } 
  
    // Method to push an element x to stack2 
    void push_B(int x) {         
        if (isFull()) 
        { 
            System.out.println("Stack Overflow");  
        } 
        else
        { 
            top2--; 
            arr[top2] = x; 
        } 
    } 
  
    // Method to pop an element from stack A
    int pop_A() 
    { 
        if (top1 >= 0) 
        { 
            int x = arr[top1]; 
            top1--; 
            return x; 
        } 
        else
        { 
            System.out.println("Stack Underflow"); 
           
        } 
        return 0; 
    } 
  
    // Method to pop an element from stack B
    int pop_B() 
    { 
        if(top2 < size) 
        { 
            int x =arr[top2]; 
            top2++; 
            return x; 
        } 
        else
        { 
            System.out.println("Stack Underflow"); 
         
  
        } 
        return 0; 
    } 
    
    void display_A(){
      if(isEmpty());
      System.out.println();
      
      System.out.print(" Elements in Stack A : ");
      for(int i=0;i<=top1;i++){
        System.out.print(arr[i] + " ");
      }
    }
    
    void display_B(){
      if(isEmpty());
      System.out.println();
      
      System.out.print(" Elements in Stack B : ");
      for(int i=size-1;i>=top2;i--){
        System.out.print(arr[i] + " ");
      }
    }
    
}

    // Driver program to test twoWayStack class
public class TwoStacks{
    public static void main(String args[]) { 
       Scanner scan = new Scanner(System.in);
      
       System.out.print(" Enter the size of the array : ");
       int n = scan.nextInt();
        TwoWayStacks stack2way = new TwoWayStacks(n);
        
        System.out.println("\n ******* MENU *******"); 
        System.out.println("\n 1. Push element into Stack A \n 2. Push element into Stack B \n 3. Pop element from Stack A \n 4. Pop element from Stack B \n 5. Display Stack A \n 6. Display Stack B \n 7. Exit\n");
        int choice = 1;
        while(choice != 7){
        System.out.print("\n Please enter your choice : ");
        choice = scan.nextInt();
        
          switch(choice){
            case 1 : System.out.print(" Enter the value to be pushed into Stack A : ");
                     int a = scan.nextInt();
                     stack2way.push_A(a);
                     break;
                     
            case 2 : System.out.print(" Enter the value to be pushed into Stack B : ");
                     int b = scan.nextInt();
                     stack2way.push_B(b);
                     break;
                     
            case 3 : System.out.println(" The value popped from Stack A : " + stack2way.pop_A());
                     break; 
                     
            case 4 : System.out.println(" The value popped from Stack B : " + stack2way.pop_B());
                     break;
                     
            case 5 : stack2way.display_A();
                     break;
                     
            case 6 : stack2way.display_B();
                     break;
                     
            case 7 : break;                      
                           
          }
        }
    } 
} 