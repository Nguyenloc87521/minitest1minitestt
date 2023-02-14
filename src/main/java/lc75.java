package PACKAGE_NAME;public class lc75 {
      public void sortColors(int[] nums) {
        int idx=0;
        int idx1 = nums.length -1;
        for (int i = 0; i <= idx1; i++) {
            if(nums[i]==0 && i != idx){
                int tmp = nums[idx];
                nums[idx++]=nums[i];
                nums[i]=tmp;
            } else if (nums[i] == 2 && i != idx1) {
                int tmp = nums[idx1];
                nums[idx1--] = nums[i];
                nums[i] = tmp;
            } else {
                i++;
            }
        }
    }
}
