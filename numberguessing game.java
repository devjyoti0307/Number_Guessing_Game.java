import java.util.Scanner;
import java.util.Random;
public class Main {
  public static void main(String[] args) 
  {
  Scanner in=new Scanner(System.in);
    String game="yes";
    while(game.equals("yes"))
      {
        Random rand = new Random();
        int randm = rand.nextInt(100);
        int guess=-1;
        int c=0;

      while(guess!=randm)
      {
          System.out.println("Guess a number btween 1 to 100");
           guess= in.nextInt();
             
            c++;

        if(guess==randm)
        {
          System.out.println("Awesome you guessed the right number:");
        System.out.println("It only took you "+c+"guesses");
         System.out.println("Would you like to play again:");
           game=in.next().toLowerCase();
        }
        else if(guess>randm)
          {
      System.out.println("Your guess is too high ,try again later");
          }
        else
        {
      System.out.println("Your guess is too low ,try again later");
        }
      }
  }
    in.close();
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
}