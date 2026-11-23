public class Switch_Example {
    public static void main(String[] args){
        int day = 4;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Thueseday");
                break;
            case 4: 
                System.out.println("Wensday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid Day");
        }

    }
    
}
