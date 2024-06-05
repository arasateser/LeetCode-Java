/*
 * The isBadVersion API is defined in the parent class VersionControl.
 * boolean isBadVersion(int version);
 */

public class Solution extends VersionControl {
    // Method to find the first bad version
    public int firstBadVersion(int n) {
        // Initialize left pointer to the first version
        int left = 1;
        // Initialize right pointer to the last version
        int right = n;
        int mid; // Declare variable to store the middle version

        // If there's only one version, return it immediately
        if(right == left)
            return left;

        // Perform binary search to find the first bad version
        while (left < right) {
            // Calculate the middle version to check
            mid = ((right - left) / 2) + left;

            // Check if the middle version is bad
            if (isBadVersion(mid)) {
                // Narrow down the search range to the left half
                right = mid;
            } else {
                // Narrow down the search range to the right half
                left = mid + 1;
            }
        }

        // Return the left pointer, which points to the first bad version
        return left;
    }
}
