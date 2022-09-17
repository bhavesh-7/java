import java.util.Scanner;
class circle{
    public static void main(String... args){
        final float pi=3.14f;
        Scanner get = new Scanner(System.in);
        System.out.println("Enter radius of the Circle: ");
        float radius = get.nextFloat();
        float r=radius;
        float area=pi*r*r;
        float perimeter=2*pi*r;
        System.out.println("Area of the Circle: "+area);
        System.out.println("Perimeter of circle: "+perimeter);
    }
}
