public class ElementFrequency   {
    public static void main(String[] args){
        int [] arr = {10,20,50,12,42,32,12,10,10,20,10};
        int count = 0;
        int target = 10;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
      System.out.println("Element "+ target + " appears " + count + " Times ");
    }
     
}

