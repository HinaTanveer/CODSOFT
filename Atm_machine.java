import java.util.Scanner;
public class Atm_machine {
double ammount;
double balance;
double deposit;
double new_balance;
int choice;
public void display(){
  
    System.out.println("press 1 if u want to withdraw cash");
    System.out.println("press 2 if u want to deposit your cash");
    System.out.println("press 3 if u wannt to check your balance"); 
    System.out.println("enter your choice "); 
}
public void balance(){
System.out.println("please enter your balance");
Scanner s=new Scanner(System.in);
balance=s.nextDouble();
System.out.println("your balance is "+balance);   
}
public void withDraw(){
System.out.println("how much money you want to withdraw ?");
Scanner s=new Scanner(System.in);
ammount=s.nextDouble();
  if(ammount>balance){
      System.out.println("insufficent balance for withdraw");
  }
  else{
      double new_balance=balance-ammount;
      System.out.println("you have succesflly withdrawn RS :"+ammount);
      System.out.println("your current balance is"+new_balance);
  }
}
public void deposit(){
    System.out.println("how much money u want to depOsit?");
    Scanner s=new Scanner(System.in);
    deposit=s.nextDouble();
    new_balance=balance+deposit;
    System.out.println("your new balance is "+new_balance);
}
public  void show(){
   Scanner s=new Scanner(System.in); 
   choice=s.nextInt();
   if(choice==1){
       balance();
   }
   else
       if(choice==2){
           deposit();
       }
    else
       if(choice==3){
           withDraw();
       } 
       else{
           System.out.println("exit");
       }
   
}
    public static void main(String[] args) {
     Atm_machine a=new Atm_machine();
     a.balance();
     a.display();
     a.show();
    }
    
}
