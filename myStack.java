import java.util.*;

public class myStack {

    ArrayList<Integer> stackA = new ArrayList<Integer>();
    ArrayList<Integer> stackB = new ArrayList<Integer>();




    void pop_a() {
        stackA.remove(stackA.size() - 1);
    }

    void pop_b() {
        stackB.remove(stackB.size() - 1);
    }

    void push_a(int aEntry) {
        stackA.add(aEntry);
    }

    void push_b(int bEntry) {
        stackB.add(bEntry);
    }

    boolean isEmpty(ArrayList<Integer> testStack) {
        if (testStack.isEmpty()) {
            return true;
        } else {
            return false;
        }



    }

    boolean isFull1(ArrayList<Integer> testStack) {
        return false;
    }


    public static void main(String[] args) {

        myStack stack1 = new myStack();

        stack1.push_a(1);
        stack1.push_a(2);
        stack1.push_a(3);
        stack1.push_a(4);

        stack1.push_b(1);
        stack1.push_b(2);
        stack1.push_b(3);
        stack1.push_b(4);

        
        /*
         * push a few values onto stack A then push a few values on stack B
         * pop the values on stack a and check theyre correct as they are popped
         * pop the values on stack B and check theyre correct as they are popped
         *
         *
         */
    }
}