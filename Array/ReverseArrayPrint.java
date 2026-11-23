public class ReverseArrayPrint {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        
       System.out.println("Reverse Array");
       for(int i = nums.length-1; i >= 0; i--){
            System.out.print(nums[i]);
       }
       
       System.out.println();
    }
}