public class rotatedsortedArray{
    public static int search(int nums[],int target){
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        while(start<=end){
             mid = (start+end)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(nums[start] <=nums[mid]){
                if(target >=nums[start] && target < nums[mid]){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target>nums[start] &&  target <=nums[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] ={4,5,6,7,8,1,2};
        int target = 8;
        System.out.println(search(nums,target));
    }
}