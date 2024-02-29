class Solution {
    // Method for flood fill starting from point (sr, sc) with the new color
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // If the starting point already has the new color, no need to flood fill
        if (image[sr][sc] == color)
            return image; // Return the original image

        // Call the fill method to perform flood fill starting from (sr, sc)
        fill(image, sr, sc, color, image[sr][sc]);

        // Return the modified image after flood fill
        return image;
    }

    // Recursive helper method to perform flood fill
    public void fill(int[][] image, int sr, int sc, int color, int current) {
        // Base case: if the current pixel is out of bounds or has a different color
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
            return; // Stop recursion

        // Base case: if the current pixel already has the new color
        if (current != image[sr][sc])
            return; // Stop recursion

        // Update the color of the current pixel to the new color
        image[sr][sc] = color;

        // Recursively fill neighboring pixels in all four directions
        fill(image, sr - 1, sc, color, current); // Up
        fill(image, sr, sc - 1, color, current); // Left
        fill(image, sr + 1, sc, color, current); // Down
        fill(image, sr, sc + 1, color, current); // Right
    }
}
