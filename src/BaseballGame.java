import java.util.Scanner;
import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("+")) {
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a + b);
            }
            else if (s.equals("D")) {
                st.push(st.peek() * 2);
            }
            else if (s.equals("C")) {
                st.pop();
            }
            else {
                st.push(Integer.parseInt(s));
            }
        }

        int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        System.out.println(sum);
    }
}