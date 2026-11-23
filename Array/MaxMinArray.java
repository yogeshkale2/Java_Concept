public class MaxMinArray{
    public static void main(){
        int [] nums = { 20,5,88,55,40,20,5};
        int max =nums[0];
        int min =nums[0];
        for(int i=0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
               
            } 
            if(nums[i] < min){
                min = nums[i];
            }

        }

        System.out.println("Max Value of Array : "+ max);

        System.out.println("Min value of Array : "+ min);
    }

}