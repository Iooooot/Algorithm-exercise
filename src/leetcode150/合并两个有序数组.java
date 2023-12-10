package leetcode150;

/**
 * @author wht
 * @date 2023/10/22 9:58
 */
public class 合并两个有序数组 {
    public static void main(String[] args) {
        int[] nums1 ={1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int idx1=0,idx2=0,cnt = 0;
        int[] t = new int[m + n];
        while(idx1 < m || idx2 < n){
            if(idx1 == m){
                t[cnt++] = nums1[idx1++];
            }else if(idx2 == n){
                t[cnt++] = nums2[idx2++];
            }else if(nums1[idx1] <= nums2[idx2]){
                t[cnt++] = nums1[idx1++];
            }else{
                t[cnt++] = nums2[idx2++];
            }
        }
        for (int k = 0; k < n+m; k++) {
            nums1[k] = t[k];
        }
    }
}
