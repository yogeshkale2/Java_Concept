public class Arrayno{
    public static void main(String[] args ){
        int [] arr = new int[3];
        arr[0]= 10;
         arr[1]= 20;
          arr[2]= 30;
           System.out.println(arr.length);
         //  System.out.println(arr[0]);
            for(int i = 0; i< arr.length ; i++){
                System.out.println(arr[i]);
                
            } 
            for(int num : arr){
                System.out.println(num);
            }
    }
}
