//LET'S ENHANCE SOME IN GUSSER GAME
import java.util.Random;
import java.util.*;
class Gusser
{ 
	//Guesser has Limits of thinking value Between 1 to 100
	public static int guess()
	{
		 // a==stores actual value && b== guessed value
		int a,b = 0;
		//Declare the final value for Guess to Guesser
	final int max=20;
	Scanner scan=new Scanner (System.in);
	// We have used One Utility Class Random(import java.util.Random;) to search random value
	Random ran=new Random();
	boolean correct= false ;
	//  For Right Answer
	a=ran.nextInt(max) + 1;
	
	// We've Used Loop For Guessed Correct Answer
	while(!correct)
	{
		System.out.println("Gusser guess the Number Between  1 to 20 only:");
		
		// guessing the values
		b=scan.nextInt();
        // if b is greater than actual
		if(b>a)
		   {
			System.out.println("Hey Anna! It's too High , try Again ");
		   }
		// if b is less than actual
	    else if (b < a) 
		    {
                System.out.println("Hey Babu ! it's also Too low na , try another value");
            }
       // b is equal to actual value
         else 
            {
                System.out.println("Yes, you guessed the number, okkk ra !" + b);
                correct = true;
            }
       }
	return b;
        
	}
}

  class Players
 {
	int Player;
	int Player() 
	{
	    System.out.println("Hey Player , Now Guess the Number");
	    Scanner scan=new Scanner (System.in);
	    Player=scan.nextInt();
	    return Player;
	}
}
  class Umpire
  {     
	    int numFromGuesser;
  	    int numFromPlayer1;
		int numFromPlayer2;
		int numFromPlayer3;

		void collectNumFromGuesser()
		{
			Gusser g=new Gusser();
			numFromGuesser=g.guess();
		}
		void collectNumFromPlayers()
		{
			Players p1=new Players();
			Players p2=new Players();
			Players p3=new Players();
			numFromPlayer1=p1.Player();
			numFromPlayer2=p2.Player();
			numFromPlayer3=p3.Player();
		}
		void compare()
		{
			if(numFromGuesser==numFromPlayer1)
			{
				if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
				{
					System.out.println("All players won the game");
				}
				else if(numFromGuesser==numFromPlayer2 )
				{
					System.out.println("Player 1 & Player2 won");
				}
				else if(numFromGuesser==numFromPlayer3)
				{
					System.out.println("Player 1 & Player3 won");
				}
				else
				{
				System.out.println("Player 1 won the game");
				}
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				if(numFromGuesser==numFromPlayer3)
				{
					System.out.println("Player 2 & Player3 won");
				}
				else
				{
				System.out.println("Player 2 won the game");
				}
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 3 won the game");
			}
			else
			{
				System.out.println("Game lost Try Again!");
			}
			
		}
  }
public class GusserGameProject {

	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();

	}

}
