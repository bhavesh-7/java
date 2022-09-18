import java.util.*;
class b{
    public static void main(String... args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter Hours: ");
        float hour = get.nextFloat();
        float min = hour * 60;
        System.out.println(hour+" Hours = "+min+" Minutes");
    }
}
