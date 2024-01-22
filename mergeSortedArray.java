class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; //last index of nums1
        int j = n - 1; //last index of nums2
        int k = m + n - 1; //last index of nums2 can get placed to
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
