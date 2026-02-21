import java.util.Stack;

public class reversestack {




        public static void main(String[] args) {

            String str = "DSA";
            Stack<Character> stack = new Stack<>();

            // push all characters
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }

            // pop to reverse
            String reversed = "";
            while (!stack.isEmpty()) {
                reversed += stack.pop();
            }

            System.out.println("Original: " + str);
            System.out.println("Reversed: " + reversed);
        }
    }

