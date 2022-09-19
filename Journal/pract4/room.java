import java.util.*;
import java.io.*;
class room{
    float r_no,r_area,r_type;
    Boolean ac;
    public static void main(String... args){
        room obj = new room();
        obj.get();
        obj.show();
    }
    void get(){
        Scanner i = new Scanner(System.in);
        System.out.print("Enter Room No.: ");
        r_no=i.nextFloat();
        System.out.print("Enter Room Area: ");
        r_area=i.nextFloat();
        System.out.print("Enter Room Type: ");
        r_type=i.nextFloat();
        System.out.print("AC-true/false: ");
        ac=i.nextBoolean();
    }
    void show(){
        System.out.println("Room Number     : "+r_no);
        System.out.println("Room Area       : "+r_area);
        System.out.println("Room Type       : "+r_type);
        System.out.println("Air conditioned : "+ac);
    }
}
