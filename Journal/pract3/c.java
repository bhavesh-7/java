import java.util.*;
class c{
    public static void main(String... args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=get.nextInt();
        System.out.println("Multiplication table for "+n+" is: \t");
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
