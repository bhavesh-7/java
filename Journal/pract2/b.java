import java.util.*;
class b{
    public static void main(String... args){
        Scanner get = new Scanner(System.in);
        int n,m,flag;
        n=m=flag=0;
        System.out.print("Enter Number: ");
        n=get.nextInt();
        m=n/2;
        for(int i=2;i<=m;i++){
            if(n%i==0){
                System.out.println(n+" is not a prime number.");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(n+" is a prime number.");
        }
    }
}
