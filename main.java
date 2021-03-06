class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] result = new int[m+n];
        int i, j, k = 0;
        
        while(i!=m && j!=n){
            if(nums1[i]>nums2[j]){
                result[k++] = nums2[j++];
            }
            else{
                result[k++]=nums1[i++];
            }
        }
        
        while(j!=n){
            result[k++]=nums2[j++];
        }
        
        while(i!=m){
            result[k++]=nums1[i++];
        }
        
        for(int l=0;l<m+n;l++){
            nums1[l]=result[l];
        }
    }
}
