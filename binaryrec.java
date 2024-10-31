package recursion;

public class binaryrec {

    static int binarysearch(int []nums,int start,int end,int target)
    {
        int mid;

        if(start>end)
        {
            return -1;
        }
        mid =  start+(end-start)/2;

        if(nums[mid]<target)
        {
            return binarysearch(nums, mid+1, end, target);
        }
        else if(nums[mid]>target)
        {
            return binarysearch(nums, start , mid-1, target);
        }
        else{
            return mid;
        }


    }
    public static void main(String[] args) {
        
        int []nums = {1,2,3,46,8,9,10,11,34,67,111};
        int target = 11;
        int index = binarysearch(nums, 0, nums.length-1, target);
        if(index==-1)
        System.out.println("the element is not found");
        else
        System.out.println("the element found at position "+ index);

        
    }
    
}
