public class CountSign {
    public static void main(String[] args){
        int [] nums = {10,20,50,45,23,2,40,0,-2,0,-5,-4};
        int positivecount = 0;
        int negativecount = 0;
        int zerocount = 0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] > 0 ) {
                positivecount++;
                
            }  else if(nums[i] < 0){
                negativecount++;
            }
            else{
                zerocount++;

            }
            
        }
        System.out.println("Positive Count: " +  positivecount);
        System.out.println("Negative Count :" +  negativecount);
        System.out.println("Zero Count :" +  zerocount);
    }
    
}
