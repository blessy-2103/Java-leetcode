class Solution {
    public int elevatorRequests(int n, int[] requests) {
         int totalTime = 0, current = 0;

        for (int next : requests) {
            totalTime += Math.abs(next - current);
            current = next;
        }

      return totalTime;
    }
}