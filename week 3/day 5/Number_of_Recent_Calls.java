import java.util.*;
class RecentCounter {

    private final Queue<Integer> requests;

    public RecentCounter() {
        requests = new ArrayDeque<>();
    }

    public int ping(int t) {
        requests.offer(t);

        while (requests.peek() < t - 3000) {
            requests.poll();
        }

        return requests.size();
}
}
/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */