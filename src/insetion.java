import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;
public class insetion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
           int y;
        System.out.println("enter the no of elements ");
           y = sc.nextInt();
        System.out.println("enter the inserting elemnts");
           for (int i = 0;i<y;i++){
               int f = sc.nextInt();
               st.push(f);
           }
        System.out.println(st);
        int idx;
        System.out.println("enter the index ");
        idx = sc.nextInt();
        int x ;
        System.out.println("enter the value of index you want to insert ");
        x = sc.nextInt();
        Stack<Integer> temp = new Stack<>();
        while (st.size()>idx) {
            temp.push(st.pop());
        }
        st.push(x);
           while (temp.size()>0){
               st.push(temp.pop());
           }System.out.println(st);
        }

    }

