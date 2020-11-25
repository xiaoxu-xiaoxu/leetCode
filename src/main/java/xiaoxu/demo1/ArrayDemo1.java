package xiaoxu.demo1;

import java.util.HashMap;

/**
 * @author xx
 * @create 2020/9/10 9:13
 */
public class ArrayDemo1 {

    public static int[] spiralOrder1(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rows = matrix.length, columns = matrix[0].length;
        int[] order = new int[rows * columns];
        int index = 0;
        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                order[index++] = matrix[top][column];
            }
            for (int row = top + 1; row <= bottom; row++) {
                order[index++] = matrix[row][right];
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column > left; column--) {
                    order[index++] = matrix[bottom][column];
                }
                for (int row = bottom; row > top; row--) {
                    order[index++] = matrix[row][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return order;
    }


    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rows = matrix.length, columns = matrix[0].length;
        boolean[][] visited = new boolean[rows][columns];
        int total = rows * columns;
        int[] order = new int[total];
        int row = 0, column = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;
        for (int i = 0; i < total; i++) {
            order[i] = matrix[row][column];
            visited[row][column] = true;
            int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || visited[nextRow][nextColumn]) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];
        }
        return order;
    }

    public static int[] spiralOrder2(int[][] matrix){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        int rows = matrix.length, columns = matrix[0].length;
        int[] order = new int[rows * columns];
        int index = 0;
        int left = 0, right = columns - 1, top = 0, low = rows - 1;
        while(left <= right && top <= low){
            for(int left1 = left; left1 <= right; left1++){
                order[index++] = matrix[top][left1];
            }
            for(int top1 = top + 1; top1 <= low; top1++){
                order[index++] = matrix[top1][right];
            }
            if(left < right && top < low){
                for(int right1 = right - 1; right1 > left; right1--){
                    order[index++] = matrix[low][right1];
                }
                for(int low1 = low; low1 > top; low1--){
                    order[index++] = matrix[low1][left];
                }
            }
            left++;
            right--;
            top++;
            low--;
        }
        return order;
    }


    public static void main(String[] args) {

    }

}
