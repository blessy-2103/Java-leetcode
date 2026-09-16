class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
         int minDistance = Integer.MAX_VALUE;
        int nearestIndex = -1;

        for (int i = 0; i < drones.length; i++) {
            int droneX = drones[i][0];
            int droneY = drones[i][1];
            int range = drones[i][2];

            int distance = Math.abs(droneX - target[0]) + Math.abs(droneY - target[1]);

            if (distance <= range && distance < minDistance) {
                minDistance = distance;
                nearestIndex = i;
            }
        }

        return nearestIndex;
    }
}