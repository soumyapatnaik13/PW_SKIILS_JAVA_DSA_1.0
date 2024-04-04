import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class nextGreatestElementUsingStack {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 1, 6, 3, 4};
        int[] ans = find(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] find(int[] arr) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> li = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // Stack will hold the next greatest element
            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }

            if (st.isEmpty()) {
                li.add(-1); // No greater element found
            } else {
                li.add(st.peek());
            }

            st.push(arr[i]);
        }

        int[] ans = new int[li.size()];
        for (int j = 0; j < ans.length; j++) {
            ans[j] = li.get(ans.length - 1 - j);
        }
        return ans;
    }
}
