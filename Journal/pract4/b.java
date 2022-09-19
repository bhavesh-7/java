import java.util.*;
import java.io.*;
class b{
    float price;
    String b_name,a_name;
    public static void main(String... args){
        book obj = new book();
        obj.get();
        obj.show();
    }
    void get(){
        Scanner i = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        b_name=i.nextLine();
        System.out.print("Enter Book Author name: ");
        a_name=i.nextLine();
        System.out.print("Enter Book Price: ");
        price=i.nextFloat();
    }
    void show(){
        System.out.println("Book Name   : "+b_name);
        System.out.println("Author Name : "+a_name);
        System.out.println("Book Price  : "+price);
    }
}
