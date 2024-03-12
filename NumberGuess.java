import java.util.Scanner;
import java.util.Random;
public class NumberGuess {
int GenerateNum;
int UserGuess;
int limit=3;
int choice;

public NumberGuess(){
    Random r=new Random(); 
    GenerateNum=r.nextInt(100);
    System.out.println("WELCOME TO THE NUMBER GUESSING GAME!");
}
public void play(){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your Desire number..");
    UserGuess= s.nextInt();
    if(UserGuess==GenerateNum){
     System.out.println("WOW..your guess is right");
    }
    else
        if(UserGuess>GenerateNum){
            System.out.println("the number you have entered is greater then the generated number..");
        }
     else{
            System .out.println( "number is smaller then the number entered ");
        }
    if(UserGuess!=GenerateNum){
      System.out.println("if u wanna play again,then press 1 otherwisw press any key..");
      choice=s.nextInt();
      if(choice==1){
        play();
      }
      else{
          System .out .println("THE GENERATED NUMBER IS :"+GenerateNum);
          System.out.println("BETTER TRY AGAIN!");
      }
    }
   
}

    public static void main(String[] args) {
       NumberGuess n=new NumberGuess();
       n.play();
    }
    
}
