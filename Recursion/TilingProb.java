public class TilingProb {
    public static int numberOfWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        int verticalWays=numberOfWays(n-1);

        int horizontalWays=numberOfWays(n-2);

        int totalWays = verticalWays+horizontalWays;
        
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println("Total no. of Ways to arrange the tiles are " + numberOfWays(4));
    }
}


// We have a floor of size 2 x n (2 rows, n columns) and 2 x 1 tiles. We need to calculate the number of ways to arrange these tiles to completely cover the floor.

// Base Case:

// If the floor has n = 0, there is 1 way to arrange the tiles: do nothing.
// If the floor has n = 1, there is 1 way to arrange the tiles: place one vertical tile.
// Recursive Step:

// If we place the first tile vertically, the remaining floor has size 2 x (n-1).
// If we place the first two tiles horizontally, the remaining floor has size 2 x (n-2).
// So, the total number of ways for a floor of size 2 x n is the sum of:

// The number of ways to cover a 2 x (n-1) floor.
// The number of ways to cover a 2 x (n-2) floor.
// This gives the recurrence relation:

// ways(n) = ways(n-1) + ways(n-2)

// Step-by-Step Explanation with Example
// Let’s calculate the number of ways for a 2 x 4 floor:

// Base Cases:

// For n = 0, ways(0) = 1 (do nothing).
// For n = 1, ways(1) = 1 (only one vertical tile fits).
// Recursive Steps:

// For n = 2,

// You can place 2 vertical tiles (remaining size = 2 x 0, which has 1 way).
// Or, you can place 2 horizontal tiles (remaining size = 2 x 0, which has 1 way).
// Total = ways(1) + ways(0) = 1 + 1 = 2.
// For n = 3,

// Place the first tile vertically (remaining size = 2 x 2, which has 2 ways).
// Or, place the first two tiles horizontally (remaining size = 2 x 1, which has 1 way).
// Total = ways(2) + ways(1) = 2 + 1 = 3.
// For n = 4,

// Place the first tile vertically (remaining size = 2 x 3, which has 3 ways).
// Or, place the first two tiles horizontally (remaining size = 2 x 2, which has 2 ways).
// Total = ways(3) + ways(2) = 3 + 2 = 5.

// countWays(5)
//  ├── countWays(4)
//  │    ├── countWays(3)
//  │    │    ├── countWays(2)
//  │    │    │    ├── countWays(1) = 1
//  │    │    │    └── countWays(0) = 1
//  │    │    └── countWays(1) = 1
//  │    └── countWays(2)
//  │         ├── countWays(1) = 1
//  │         └── countWays(0) = 1
//  └── countWays(3)
//       ├── countWays(2)
//       │    ├── countWays(1) = 1
//       │    └── countWays(0) = 1
//       └── countWays(1) = 1

