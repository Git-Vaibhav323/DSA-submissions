class Solution {
    public int[] productExceptSelf(int[] nums) {
        // understanding: suppose im at ith index and i need to find out the product of all the elements except that ith element...so what can i do here run a for loop at ith multiply all the element of the array and then divide / ith element ( not to used)
// 2nd approach : run the loop from i to n then start multiplying from i+1 to n like that or stand at that index and then calculate its left and right 
        int n = nums.length;
         int[] out=new int [n];
         int prefix=1;
        for ( int i=0;i<n;i++){
           out[i]= prefix;
           prefix=prefix*nums[i];
        }
        int suffix =1;
        for ( int i=n-1;i>=0;i--){
            out[i]=out[i]* suffix;
            suffix= suffix* nums[i];

        }
        return out;
    }
}  
