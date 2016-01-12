import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    int arr[][];
    int x;
    int y;

    public Solution(int x, int y) {
        this.arr = new int[x][y];
        this.x = x;
        this.y = y;
    }

    public void populateArray() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < this.x; i++) {
            for (int j = 0; j < this.y; j++) {
                this.arr[i][j] = in.nextInt();
            }
        }
    }

    public void printArray() {
        for (int i = 0; i < this.x; i++) {
            for (int j = 0; j < this.y; j++) {
                System.out.print(this.arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int returnSum(int first, int second) {
        int summ = 0;
        summ += arr[first][second];
        summ += arr[first][second + 1];
        summ += arr[first][second + 2];
        summ += arr[first + 1][second + 1];
        summ += arr[first + 2][second];
        summ += arr[first + 2][second + 1];
        summ += arr[first + 2][second + 2];
        return summ;
    }

    public static void main(String[] args) {
        Solution array2D = new Solution(6, 6);
        array2D.populateArray();
        Integer result = null;
        for (int i = 0; i < array2D.x - 2; i++) {
            for (int j = 0; j < array2D.y - 2; j++) {
                int summ = array2D.returnSum(i, j);
                if (result == null) {
                    result = summ;
                } else if (summ > result) {
                    result = summ;
                }
            }
        }
        System.out.println(result);
    }
}

