import java.util.*;
class pract{
    public static void main(String... args){
        Scanner get = new Scanner(System.in);
        int x,sum=0,avg=0;
        int[] n= new int[50];
        System.out.print("Enter Values Strength: ");
        x=get.nextInt();
        for(int i=1; i<=x; i++){
            System.out.print("Enter "+i+" value: ");
            n[i]=get.nextInt();
        }
        System.out.println("Given Inputs are: ");
        for(int i=1;i<=x;i++){
            System.out.println(i+": "+n[i]);
        }
        for(int i=1;i<=x;i++){
            sum+=n[i];
        }
        System.out.println("Sum of "+x+" values = "+sum);
        System.out.println(" ");
        avg=sum/x;
        System.out.println("Average of "+x+"  values = "+avg);
    }
}
