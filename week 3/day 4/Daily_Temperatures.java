import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty()
                    && temperatures[stack.peek()] < temperatures[i]) {
                int previousDay = stack.pop();
                answer[previousDay] = i - previousDay;
            }
            stack.push(i);
        }

        return answer;
    }
}