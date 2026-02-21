
import java.util.Stack;
import java.util.Scanner;
public class copy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st  = new Stack<>();
        int n;
        System.out.println("enter the number of elements ");
        n = sc.nextInt();
        System.out.println("enter the number of inserting elemnets");
        for(int i = 0;i<n; i++){
            int x = sc.nextInt();
             st.push(x);
        }
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            int x = st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println(rt);
        Stack<Integer> gt = new Stack<>();
        while(rt.size()>0){
            int x = rt.peek();
            gt.push(x);
            rt.pop();
        }
        System.out.println(gt);
    }

}
