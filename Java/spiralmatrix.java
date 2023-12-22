public class spiralmatrix {
    public static void spiral(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int sr = 0, er = row - 1;
        int sc = 0, ec = col - 1;

        while (sr <= er && sc <= ec) {
            for (int j = sc; j <= ec; j++) {
                System.out.print(matrix[sr][j] + " ");
            }
            for (int j = sr + 1; j <= er; j++) {
                System.out.print(matrix[j][ec] + " ");
            }
            for (int j = ec - 1; j >= sc; j--) {
                System.out.print(matrix[er][j] + " ");
            }
            for (int j = er - 1; j >= sr + 1; j--) {
                System.out.print(matrix[j][sc] + " ");
            }

            sr++;
            sc++;
            er--;
            ec--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        spiral(matrix);
    }
}
