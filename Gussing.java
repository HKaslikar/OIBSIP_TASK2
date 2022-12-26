import java.util.Scanner;
public class Gussing{


public static void main(String[] args) {
    int t = 10;
    int answer = (int) (Math.random() * 100) + 1;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Guess the number between 1 to 100 , You have only five tries! ");
   
    
        while(t>0){ 
        int key =sc.nextInt();
        t--;
         if(answer==key){
            System.out.println("You won the game ! \n your Score is " + t +""); 
            break;
        }
        else if(answer<key){
            System.out.println("Your guess is high.\nYou have " + (t ) + " tries left.");
             
        }
        else if(answer>key){
            System.out.println("Your guess is low.\nYou have " + (t ) + " tries left."); 
            
        }
        
        
    }
   
  }

 }
