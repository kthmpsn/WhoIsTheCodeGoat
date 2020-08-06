public class Problem02 {
    public static void main(String[] args) {
        System.out.println(magicSquare(3));
    }
    public static String magicSquare(int n) {
        /*
         * 1: going to assign the numbers in ascending order starting from 1
         * 2: Start from the bottom, middle cell. Increment value and move to bottom right diagonal
         * 3: Repeat. If the spot is taken, move one row up and continue
         * 4: Use modulo to deal with border
         *
         */
        int magicSum = (int) (n * (Math.pow(n, 2) + 1) / 2);
        int table[][] = new int[n][n];
        int currentVal = 1;// Step 1
        int row = n - 1; // if n = 3, row = 2
        int col = n / 2; // if n = 3, col = 1
        while (currentVal <= n*n) {
            if (table[row][col] == 0) { // If empty, ok to set value
                table[row][col] = currentVal; // Step 2
                currentVal++; // increment
                row = (row + 1) % n; // Step 3 and 4. Move diagonal.
                col = (col + 1) % n;
            } else {// space taken
                row = (row - 1)% n; //Do nothing but move one row up.
            }
        }
        String result = "";
        result+= "Magic Square of size " + n + "\n" +
                "----------------------\n";
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                result += String.format("%3d ", table[x - 1][y - 1]);
            }
            result += "\n";
        }
        result+="Sum in each row & each column = "+ n + "*(" + n + "^2+1)/2 = " + magicSum;
        return result;
    }
}