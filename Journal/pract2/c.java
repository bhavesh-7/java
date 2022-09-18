import java.util.*;
class c{
    public static void main(String... args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks=get.nextInt();
        if(marks>100){
            System.out.println("Marks Invalid...");
        }else if(marks>=80){
            System.out.println("O Grade.");
        }else if(marks>=70){
            System.out.println("A+ Grade.");
        }else if(marks>=60){
            System.out.println("A Grade.");
        }else if(marks>=50){
            System.out.println("B Grade.");
        }else if(marks>=40){
            System.out.println("C Grade.");
        }else if(marks<40){
            System.out.println("Fail.");
        }else{
            System.out.println("Marks Invalid...");
        }
    }
}
