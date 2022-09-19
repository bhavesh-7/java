import java.util.*;
class b{
    public static void main(String... args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=get.nextInt();
        System.out.print("Factors of number are: ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i);
                
                System.out.print(" ");
            }
        }
    }
}
