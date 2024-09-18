package ArraysAndArrayList;

public class TrappigRainWater {
    // Given n non-negative integers representing an elevation map where the
    // width of each bar is 1, compute how much water it can trap after raining.
    // Auxillary arrays
    public static int trappigRainWater(int height[]) {
        // TC = O(n)
        // SC = O(n)
        // Step 1 - LeftMax
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        // Step 2 - RightMax
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        // Step 3 - loop on each bar to calculate WL and TW
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // Step 4 - calculate water level and trapped water 
            // trappedWater = (wl-bh)* width
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater +=   (waterLevel - height[i]);
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappigRainWater(height));
    }
}
