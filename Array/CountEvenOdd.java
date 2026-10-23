public class CountEvenOdd {
    public static void main(String[] args){
        int [] nums = { 10,2,5,12,14,16,3,5,7,20,53,54};
        int evencount = 0;
        int oddcount = 0;

        for(int i=0; i <nums.length; i++){
            if(nums[i] % 2 == 0){
                evencount++;
            }else{
                oddcount++;
            }
        }

        System.out.println(evencount);
        System.out.println(oddcount);
    }
    
}
