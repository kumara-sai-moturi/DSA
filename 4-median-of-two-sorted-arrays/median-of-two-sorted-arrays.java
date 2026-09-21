class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int merge[] = new int[m+n];
        int ind = 0;
        int i = 0,j = 0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                merge[ind] = nums1[i];
                i++;
            }else if(nums2[j]<nums1[i]){
                merge[ind] = nums2[j];
                j++;
            }
            ind++;
        }
        while(i<m){
            merge[ind++] = nums1[i];
            i++;
        }
        while(j<n){
            merge[ind++] = nums2[j];
            j++;
        }
        double res = 0;
        if((m+n)%2!=0){
            res = merge[(m+n)/2];
        }else{
            int k = (m+n)/2;
            res = (merge[k]+merge[k-1])/2.0;
        }
        return res;
    }
}