import java.util.*;
public class AreaOfACircle {
    public static void main(String [] args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter the radius: ");
        int radius=sc.nextInt(); 
        double area=findTheRadius(radius);
        System.out.println(area);
    }
    }
    static double findTheRadius(int radius){
        float pi=3.141f;  //float will take 4 bytes
        double area= pi*(radius*radius);// so that we dont need to type cast into a double ..cause double takes 8 bytes
        return area;
    }
}
