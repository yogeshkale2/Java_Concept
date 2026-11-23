/*public class MethodExample{
    void displaymsg(){
        System.out.println("Good Morning");
        System.out.println(" Have a Nice Day ");

    }
    public static void main(String[] args){
        MethodExample obj = new MethodExample();
        obj.displaymsg();   
    }
}
 void means nothing its instance 
 We can not return value inside void method .
*/


// Method with Return type This Example is same Method without parameter .
/*public class MethodExample{
    int add(){
        int a = 10;
       int  b = 30;
        int result = a + b;
        return result;

    }
    public static void main(String[] args){
       MethodExample obj = new MethodExample();
       int sum = obj.add();
       System.out.println("Sum: " + sum);

    }
}
 */

// Method with parameter 
/* public class MethodExample{
    int add(int a, int b){
        int result = a + b;
        return result;

    }
    public static void main(String[] args){
       MethodExample obj = new MethodExample();
       int sum = obj.add(10, 30);
       System.out.println("Sum: " + sum);

    }
}
    */

// Static Method Example .

public class MethodExample{
    static int add(int a, int b){
        int result = a + b;
        return result;

    }
    public static void main(String[] args){
      System.out.println(add(10,20));

    }
}




