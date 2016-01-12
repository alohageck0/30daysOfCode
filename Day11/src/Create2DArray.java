import java.util.Scanner;

public class Create2DArray {
    int arr[][];



    public Create2DArray(int x, int y) {
        this.arr = new int[x][y];
    }

    public int[][] populateArray() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        return arr;
    }

}
