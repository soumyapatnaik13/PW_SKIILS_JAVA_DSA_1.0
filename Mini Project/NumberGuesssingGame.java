import java.util.*;
class GuessNumber{
 int guessNumber;

   public int GuessNumber(){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter your number: ");
      guessNumber=sc.nextInt();
      return guessNumber;
   }
}

class Players{
    int num;
    String name;
    public String takeName(){
    Scanner sc= new Scanner(System.in);
     name= sc.nextLine();
     return name;
    }
    public int takeNumber(){
        Scanner sc = new Scanner(System.in);
         num=sc.nextInt();
         return num;
    }
}
 class Umpire{
    int Guessnum;
    String player1;
    String player2;
    String player3;
    int play1;
    int play2;
    int play3;
    
    Players p1= new Players();
    Players p2= new Players();
    Players p3= new Players();
   
    public void createGuess(){
        GuessNumber num= new GuessNumber(); 
        Guessnum=num.GuessNumber();
    }

    public void createplayerWithNumber(){
        System.out.println("enter the number of player 1");
         play1=p1.takeNumber();
       
       System.out.println("en5ter the number of player 2");
       play2=p2.takeNumber();
      
       System.out.println("enter the number for player 3");
       play3=p3.takeNumber();
    }

    public void createplayerWithName(){
      
        System.out.println("enter the name of player 1:");
        player1=p1.takeName();
      
        System.out.println("enter the name of player 2:");
        player2=p2.takeName();

        System.out.println("Enter the name of player 3:");
        player3=p3.takeName();
      
        
     }

     public void makeThatgame(){
        if(Guessnum==play1){
            if(Guessnum==play2 && Guessnum == play3){
                System.out.println("the winner name is"+ player1+" " + player2+ " " + player3);
                
            }
            else if(Guessnum == play2){
                System.out.println("the winner name is"+ player1 +" "+ player2);
            }
            else if(Guessnum == play3){
                System.out.println("the winner name is"+ player1 +" "+ player3);
            }
            else{
                System.out.println("the winner name is"+ player1);
            }
        }
        else if(Guessnum== play2){
            if(Guessnum==play3){
                System.out.println("the winner name is" + player2 + player3);
            }
            else{
                System.out.println("the winner is"+ player2);
            }
        }
        else if(Guessnum==play3){
               System.out.println("the winner is"+ player3);
        }
        else{
            System.out.println("not a single player make the guess correct");
        }
     }
 }
public class NumberGuesssingGame{
    public static void main(String [] args){
    /*
    create guessnumber entites where it will take the number 
    for player create a class where it will take the input from the user
    insid umpire class check if player 1,2,3 guess is matching with guess number

     */ 
       
      Umpire u= new Umpire();
      u.createGuess();
      u.createplayerWithName();
      u.createplayerWithNumber();
      u.makeThatgame();
    }
}