package leetcode;



/**
 * @author wht
 * @date 2022/11/16 9:42
 */
public class 全局倒置与局部倒置 {
    public static int res1 = 0;
    public static void main(String[] args) {
        int[] nums = {0,1};
        int res2 = 0;
        // 求局部倒置
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1]){
                res2++;
            }
        }
        // 利用归并求全局倒置
        mergeSort(0,nums.length - 1,nums);
        if(res1 == res2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    private static void mergeSort(int l, int r, int[] nums) {
        if(l >= r) {
            return;
        }
        int mid = l + r >> 1;
        mergeSort(l,mid,nums);
        mergeSort(mid+1,r,nums);
        // 中间数组
        int[] temp = new int[r - l + 1];
        int i,j,k;
        for (i = l,j = mid+1,k = 0; i <= mid && j <= r ; k++) {
            if(nums[i] <= nums[j]){
                temp[k] = nums[i++];
            }else{
                res1 += (mid - i + 1);
                temp[k] = nums[j++];
            }
        }
        while(i <= mid){
            temp[k++] = nums[i++];
        }
        while(j <= r){
            temp[k++] = nums[j++];
        }
        for (int m = 0; m < k; m++) {
            nums[l+m] = temp[m];
        }
    }
}
