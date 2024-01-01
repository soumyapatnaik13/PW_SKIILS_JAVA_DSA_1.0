import java.util.Scanner;
public class youngestOfThree {
   public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the age of ram");
   int ram= sc.nextInt();
   System.out.println("enter the age of shym");
   int shym= sc.nextInt();
   System.out.println("enter the age of gopal");
   int gopal= sc.nextInt();
   if(ram < shym){
    if(ram < gopal){
        System.out.println("youngest one is ram");
    }else{
        System.out.println("youngest one is gopal");
    }
   }
   else if(shym < ram){
      if(shym< gopal){
        System.out.println("youngest one is shym");
    }else{
        System.out.println("youngest one is gopal");
    }
   }
   }

}
