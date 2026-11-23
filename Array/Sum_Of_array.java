public class Sum_Of_array {
    public static void main(String[] args){
       int [] nums = {20,50,88,5,10};
       int sum = 0;
       for(int i=0; i< nums.length; i++){
        sum = sum + nums[i];

       }
       double avg = (double) sum / nums.length;

       System.out.println("Sum of Array: "+sum);
       System.out.println("Avg of Array: "+avg);
    
    }
}
