import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
         int computer =(int)(Math.random()*3);
         System.out.println("scissor (0), rock (1), paper (2):");
          int user=input.nextInt();
          System.out.println("The Computer:");
           switch (computer)
           {
               case 0: System.out.print("scissor."); break;
               case 1: System.out.print("rock."); break;
               case 2: System.out.print("paper.");
           } System.out.println("YOU are :");
           switch (user)
           {
               case 0: System.out.print("scissor."); break;
               case 1: System.out.print("rock."); break;
               case 2: System.out.print("paper.");
           }
           if (computer==user)
               System.out.println("TRY AGAIN !");
           else
           {
               boolean win = (user == 0 && computer == 2) ||
                       (user == 1 && computer == 0) ||
                       (user == 2 && computer == 1);
              if (win)
                   System.out.println("YOU ARE WIN!");
               else
               {
                   System.out.println("YOU ARE LOSE ");
               }
           }

    }
}
