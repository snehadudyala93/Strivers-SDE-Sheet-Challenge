public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        //declare corners
        int top = 0;
        int left = 0;
        int right = m - 1;
        int bottom = n - 1;

        while (left < right && top < bottom) {
            int prev = mat.get(top + 1).get(left);

            // Move elements from top row
            for (int i = left; i <= right; i++) {
                int temp = mat.get(top).get(i);
                mat.get(top).set(i, prev);
                prev = temp;
            }
            top++;

            // Move elements from right column
            for (int j = top; j <= bottom; j++) {
                int temp = mat.get(j).get(right);
                mat.get(j).set(right, prev);
                prev = temp;
            }
            right--;

            // Move elements from bottom row
            for (int k = right; k >= left; k--) {
                int temp = mat.get(bottom).get(k);
                mat.get(bottom).set(k, prev);
                prev = temp;
            }
            bottom--;

            // Move elements from left column
            for (int l = bottom; l >= top; l--) {
                int temp = mat.get(l).get(left);
                mat.get(l).set(left, prev);
                prev = temp;
            }
            left++;
        }
    }
}