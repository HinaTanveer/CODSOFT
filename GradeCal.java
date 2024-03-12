 import java.util.Scanner;
public class GradeCal {
int  marks[];
char grade;
double percentage;
int No_of_subjects;
int total_marks;
public void calculate(){
Scanner scanner=new Scanner(System.in);
System.out.println("How many marks of subject u wanna calculate?");
No_of_subjects=scanner.nextInt();
marks=new int[No_of_subjects];
for(int i=0;i<No_of_subjects;i++){
System.out.println("enter your marks:");
marks[i]=scanner.nextInt();
total_marks+=marks[i];
System.out.println("total marks  are "+total_marks);
}
}
public void percentage(){
percentage=total_marks/No_of_subjects;
System.out.println("percentage of given number is "+percentage);
}
public void Grade(){
    if(percentage>=85){
        System.out.println("your grade is A");
    }
    else
     if (percentage>=70&&percentage<85){
        System.out.println("your grade is B");
    }
    else
      if(percentage>=55&&percentage<70){
          System.out.println("your grade is C");
      } 
    else
       if(percentage>=40&&percentage<55){
           System.out.println("your grade is D");
       }   
    else
           System.out.println("your grade is E");
}
  public static void main(String[] args) {
        GradeCal t=new GradeCal();
        t.calculate();
        t.percentage();
        t.Grade();
    }
    
}

    

