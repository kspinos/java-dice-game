/**
* Simple dice game with win/loss calculator
* Created by Konstantinos Spinos on 10/10/2019.
*/
import java.util.Scanner;
import java.util.Random;

public class Dice
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert 1 to play or 0 to exit game.");
		int answer=sc.nextInt();
		while (answer!=1 && answer!=0)
		{
			System.out.println("Wrong input. Please try again!");
			System.out.println("Insert 1 to play or 0 to exit game.");
			answer=sc.nextInt();
		}
		int wins=0;
		int losses=0;
		do
		{
			if (answer==1)
			{
				System.out.println("Guess dices sum: ");
				int sum=sc.nextInt();
				while (sum<=1 || sum>=13)
				{
					System.out.println("Incorrect guess. Please try again!");
					sum=sc.nextInt();
				}
				Dice d1=new Dice();
				Dice d2=new Dice();
				int dice_one=d1.roll();
				System.out.printf("First dice was: %d\n",dice_one);
				int dice_two=d2.roll();
				System.out.printf("Second dice was: %d\n",dice_two);
				if (dice_one+dice_two==sum)
				{
					System.out.println("Congratulations, you won!");
					wins++;
				}
				else
				{
					System.out.println("Sorry, you lost!");
					losses++;
				}
			}
			else
			{
				System.out.println("Exiting game.");
				break;
			}
			System.out.println("Insert 1 to play again or 0 to exit game.");
			answer=sc.nextInt();
			while (answer!=1 && answer!=0)
			{
					System.out.println("Wrong input. Please try again!");
					System.out.println("Insert 1 to play or 0 to exit game.");
					answer=sc.nextInt();
			}
		}
        while (answer!=0);
        System.out.println("Total wins: "+wins);
        System.out.println("Total losses: "+losses);
        System.out.println("Thank you for playing! See you in the near future :)");
	}
	public int roll()
	{
		Random number = new Random();
		return  number.nextInt(6)+1 ;
	}
}

