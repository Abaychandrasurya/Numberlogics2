// Happy Numbers
import java.util.*;
class Happy {
    static boolean isHappy(int num){
        int sum = 0;
        while( num != 0){
            int temp = num%10;
            sum += temp*temp;
            num /=10;
        }
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();       
        if(isHappy(num)){
           System.out.println("Happy number");
        }else{
           System.out.println("Not a happy number");
    }
}



}