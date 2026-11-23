public class LinearSearch{
    public static void main(String[] args){
    int [] nums = {10,20,65,55,40,10,2};
    int target = 2;
    int index = -1;
    for(int i=0; i< nums.length; i++){
        if(nums[i] == target){
            index = i;
            break;
        }
    }

        if(index != -1){
            System.out.println("Element " + target + " found index of "+ index);

        }else{
            System.out.println("Element no Found");
        }
    }
}