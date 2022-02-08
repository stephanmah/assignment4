class stackObject {

    int array[];
    int top_a;
    int top_b;
    int size;

    // Stack Constructor
    stackObject(int size) {
        array = new int[size];
        top_a = -1;
        top_b = size;

    }

    int pop_a() {
        if (top_a == -1) {
            System.out.println("You need to add values before you can pop any!");
            return -1;
        }
        return array[top_a--];
    }

    int pop_b() {
        if (top_b == array.length) {
            System.out.println("You need to add values before you can pop any!");
            return -1;
        }
        return array[top_b++];
    }

    void push_a(int a_value) {
        if (isFull()) {
            System.out.println("You've overloaded the array, it needs to be larger");
        } else {
            top_a++;
            array[top_a] = a_value;
        }
    }

    void push_b(int b_value) {
        if (isFull()) {
            System.out.println("You've overloaded the array, it needs to be larger");
        } else {
            top_b--;
            array[top_b] = b_value;
        }

    }

    boolean isEmpty() {
        if ((top_a == -1) && (top_b == size)) {
            System.out.println("The stack is empty");
            return true;
        }
        return false;
    }

    boolean isFull() {
        if (top_a < top_b - 1)
            return false;
        else
            return true;
    }

    void display_a() {
        if (isEmpty())
            ;
        System.out.println();

        System.out.println("Elements in Stack A");

        for (int i = 0; i < top_a; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    void display_b() {
        if (isEmpty())
            ;
        System.out.println();

        System.out.println("Elements in Stack bens");

        for (int i = 0; i < top_b; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public class myStack {

        public static void main(String[] args) {
            System.out.println("Test");

            stackObject stack1 = new stackObject(1);

            stack1.display_a();
            stack1.display_b();

        }

    }
}