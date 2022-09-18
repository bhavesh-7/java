import java.util.*;
class a{
    public static void main(String... args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=get.nextInt();
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        System.out.println("Factorial of number "+n+" is "+fact);
    }
}
