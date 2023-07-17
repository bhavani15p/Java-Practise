
/*
 
Trapping Rainwater (Auxiliary Arrays)
------------------

Given n non-negative integers representing an elevation map where the width of each bar is 1, 
compute how much water it can trap after raining.

height = [4, 2, 0, 6, 3, 2, 5]

(water level - bar level/height) * width = trapped water

(0 - 4) * 1 = -4 --> 0

(4 - 2) * 1 =  2

(4 - 0) * 1 =  4

(4 - 6) * 1 = -2 --> 0

(5 - 3) * 1 =  2

(5 - 2) * 1 =  3

(5 - 5) * 1 =  0


0 + 2 + 4 + 0 + 2 + 3 + 0 = 11 --> Trapped water


1. min no. of bars >= 2

2. Ascending/Descending, no water is trapped

water level = min(max left, max right)

 */
import java.util.*;
public class TrappingRainwater {

    public static int trappedRainwater(int[] height) {

        int n = height.length;

        //calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] =  height[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
            
        }
        //calculate right max boundary - array
        int rightMax[] =  new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n - 2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedWater = 0;

        //loop
        for(int i=0; i<n; i++){
            //waterlevel = min(leftmax boundary , rightmax boundary)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water = waterlevel - height[i]
            trappedWater += waterlevel - height[i];

        }
        
        return trappedWater;
        
    }
public static void main(String[] args) {
    int height[] = {4, 2, 0, 6, 3, 2, 5};
   System.out.println( "Total Trapped Water after Rain : " + trappedRainwater(height));
}
}

//O(n)


/*
 
output:
-------

Total Trapped Water after Rain : 11

 */