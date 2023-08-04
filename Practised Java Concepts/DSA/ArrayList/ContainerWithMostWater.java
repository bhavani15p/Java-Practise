import java.util.ArrayList;

public class ContainerWithMostWater {

    public static int storedWaterBruteForceApproach(ArrayList<Integer> height) {

        int maxWater = 0;
        // brute force
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }

        }
        return maxWater;
    }

    public static int storedWater2PointerApproach(ArrayList<Integer> height) {

        int maxWater = 0;
        // 2 Pointer Approach - O(n)
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            // calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            // update pointer
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }

        }
        return maxWater;
    }

    public static void main(String[] args) {

        ArrayList<Integer> waterHeight = new ArrayList<>();

        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        waterHeight.add(1);
        waterHeight.add(8);
        waterHeight.add(6);
        waterHeight.add(2);
        waterHeight.add(5);
        waterHeight.add(4);
        waterHeight.add(8);
        waterHeight.add(3);
        waterHeight.add(7);
        // System.out.println(storedWaterBruteForceApproach(waterHeight));
        System.out.println(storedWater2PointerApproach(waterHeight));

    }
}