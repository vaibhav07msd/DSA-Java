

public class arrayimplemntation {
    public static class Stack {

        int[] arr;
        int top;
        int capacity;

        Stack(int size){
            capacity = size;
            arr = new int[capacity];
            top = -1;
        }

        void push(int x){
            if(top == capacity - 1){
                System.out.println("Stack Overflow");
                return;
            }
            top++;
            arr[top] = x;
        }

        void display(){
            for(int i = 0; i <= top; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Stack st = new Stack(10);
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.push(50);
            st.push(60);
            st.push(70);
            st.display();
        }
    }}

