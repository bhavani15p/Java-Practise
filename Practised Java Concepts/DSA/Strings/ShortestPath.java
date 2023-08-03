/*
 
Q. Given a route containing 4 directions (E, W, N, S). Find the shortest path to reach destination.

"W W E E N E S E N N N"
                                    
Math formula to find shortest path = sqrt of (x2 - x1)^2 + (y2 - y1)^2 

x = 0

y = 0

N up y + 1

S down y - 1

E -> x + 1

W <- x - 1

 */

public class ShortestPath {
    public static float getShortestPath(String path) {
        int x = 0, y = 0, n = path.length();

        for (int i = 0; i < n; i++) {
            char dir = path.charAt(i);

            // south
            if (dir == 'S') {
                y--;
            }
            // north
            else if (dir == 'N') {
                y++;
            }
            // west
            else if (dir == 'W') {
                x--;
            }
            // east
            else {
                x++;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {

        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));

    }

}
