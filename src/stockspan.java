import java.util.Stack;

public class stockspan {
    public static int [] stock(int [] price ){

           int n = price.length;
           int [] span = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {

            // jab tak current price >= stack ke top wale ka price
            while (!st.isEmpty() && price[i] >= price[st.peek()]) {
                st.pop();
            }

            // agar stack empty ho gaya
            if (st.isEmpty()) {
                span[i] = i + 1;   // sab previous chote  thhe
            }
            else {
                span[i] = i - st.peek(); // distance from last greater
            }

            // current index ko stack me daal diya
            st.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int [] price = {100 , 80 , 60 ,70,75,85, 67 , 89 };
        int [] res = stock(price);
        for(int x : res){
            System.out.print(x+" ");
        }
    }
}



